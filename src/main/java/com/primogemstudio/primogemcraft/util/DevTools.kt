package com.primogemstudio.primogemcraft.util

import com.google.gson.Gson
import java.io.File
import java.io.FileInputStream
import java.io.FileNotFoundException
import java.io.InputStreamReader
import java.util.*
import java.util.function.Consumer
import kotlin.system.exitProcess

class DevTools {
    companion object {
        @JvmStatic
        fun listItems(): List<File> {
            return Arrays.stream(File("originmod/src/main/resources/assets/primogemcraft/models/item").listFiles()).toList()
        }

        @JvmStatic
        fun renameItem(s: String) {
            val args: MutableList<String> = ArrayList(Arrays.stream(s.split(" ".toRegex()).dropLastWhile { it.isEmpty() }
                .toTypedArray()).toList())
            args.removeAt(0)
        }

        @JvmStatic
        @Throws(FileNotFoundException::class)
        fun findItems() {
            val translates: Map<*, *>? = Gson().fromJson<Map<*, *>>(
                InputStreamReader(FileInputStream("originmod/src/main/resources/assets/primogemcraft/lang/zh_cn.json")),
                MutableMap::class.java
            )
            listItems().forEach(Consumer { file: File ->
                if (file.isFile()) {
                    val name = file.getName().replace(".json", "")
                    var translat = translates?.get("item.primogemcraft.$name")
                    if (translat == null) translat = translates?.get("block.primogemcraft.$name")
                    System.out.printf("%s -> %s\n", name, translat)
                }
            })
            println(listItems().size.toString() + " items")
        }

        @JvmStatic
        @Throws(FileNotFoundException::class)
        fun main(args: Array<String>) {
            val scanner = Scanner(System.`in`)
            while (true) {
                print("> ")
                when (val s: String? = scanner.next()) {
                    "lis-items" -> findItems()
                    "rename-item" -> renameItem(s)
                    "exit" -> exitProcess(0)
                    else -> println("Command not found: $s")
                }
            }
        }
    }
}