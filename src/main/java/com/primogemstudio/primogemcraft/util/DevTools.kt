package com.primogemstudio.primogemcraft.util

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import java.io.File
import java.io.FileInputStream
import java.io.FileNotFoundException
import java.io.InputStreamReader
import java.nio.file.Files
import java.nio.file.NoSuchFileException
import java.nio.file.OpenOption
import java.nio.file.Path
import java.nio.file.StandardOpenOption
import java.util.*
import java.util.function.Consumer
import kotlin.collections.HashMap
import kotlin.system.exitProcess

class DevTools {
    companion object {
        @JvmStatic
        fun listItems(): List<File> {
            return Arrays.stream(File("originmod/src/main/resources/assets/primogemcraft/models/item").listFiles()).toList()
        }

        @JvmStatic
        @Throws(NoSuchFileException::class)
        fun renameItem(scanner: Scanner) {
            try {
                val itemid = scanner.next()
                println("物品名称 -> ${getTranslationName(itemid)}")
                print("重命名物品 ID -> ")
                val imp = scanner.next()
                val itemmodel = Gson().fromJson(
                    Files.readString(File("originmod/src/main/resources/assets/primogemcraft/models/item/$itemid.json").toPath()),
                    Map::class.java
                ).toMutableMap()
                println("物品模型 -> $itemmodel")
                val textureRemapped = HashMap<String, String>()
                (itemmodel["textures"] as Map<*, *>).onEach {
                    print("重命名 (${it.key} $ ${it.value}) -> ")
                    val input = scanner.next()
                    val texturefile = "originmod/src/main/resources/assets/primogemcraft/textures/${(it.value as String).replace("primogemcraft:", "")}.png"
                    val extract = "extractassets/primogemcraft/textures/item/$input.png"
                    File(extract).parentFile.mkdirs()
                    try { Files.copy(Path.of(texturefile), Path.of(extract)) }
                    catch (_: Exception) {}

                    textureRemapped[it.key as String] = "primogemcraft:item/$input"
                }
                itemmodel["textures"] = textureRemapped

                val fljson = File("extractassets/primogemcraft/models/item/$imp.json")
                fljson.parentFile.mkdirs()
                fljson.createNewFile()
                Files.writeString(fljson.toPath(), GsonBuilder().setPrettyPrinting().create().toJson(itemmodel), StandardOpenOption.WRITE)
            }
            catch (e: Exception) {
                println("没有该物品或发生了错误 $e")
            }
        }

        private fun getTranslates(): Map<*, *>? {
            return Gson().fromJson<Map<*, *>>(
                InputStreamReader(FileInputStream("originmod/src/main/resources/assets/primogemcraft/lang/zh_cn.json")),
                MutableMap::class.java
            )
        }

        private fun getTranslationName(name: String): String? {
            val translates = getTranslates()
            var translat = translates?.get("item.primogemcraft.$name")
            if (translat == null) translat = translates?.get("block.primogemcraft.$name")
            return translat as String?
        }

        @JvmStatic
        @Throws(FileNotFoundException::class)
        fun findItems() {
            listItems().forEach(Consumer { file: File ->
                if (file.isFile()) {
                    val name = file.getName().replace(".json", "")
                    System.out.printf("%s -> %s\n", name, getTranslationName(name))
                }
            })
            println("共 ${listItems().size} 个物品")
        }

        @JvmStatic
        @Throws(FileNotFoundException::class)
        fun main(args: Array<String>) {
            val scanner = Scanner(System.`in`)
            while (true) {
                print("> ")
                when (val s: String? = scanner.next()) {
                    "li", "lis-items" -> findItems()
                    "ri", "rename-item" -> renameItem(scanner)
                    "exit" -> exitProcess(0)
                    else -> println("未找到命令 $s")
                }
            }
        }
    }
}