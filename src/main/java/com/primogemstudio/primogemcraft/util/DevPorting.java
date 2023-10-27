package com.primogemstudio.primogemcraft.util;

import com.google.common.collect.Lists;
import com.google.gson.Gson;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.*;

public class DevPorting {
    public static void main(String[] args) throws FileNotFoundException {
        var scanner = new Scanner(System.in);
        while (true) {
            System.out.print("> ");
            var s = scanner.next();
            switch (s) {
                case "lis-items":
                    findItems();
                case "rename-item":
                    renameItem(s);
                default:
            }
        }
    }

    public static List<File> listItems() {
        return Arrays.stream(new File("originmod/src/main/resources/assets/primogemcraft/models/item").listFiles()).toList();
    }

    public static void renameItem(String s) {
        List<String> args = new ArrayList<>(Arrays.stream(s.split(" ")).toList());
        args.remove(0);
    }

    public static void findItems() throws FileNotFoundException {
        Map<String, String> translates = new Gson().fromJson(
                new InputStreamReader(new FileInputStream("originmod/src/main/resources/assets/primogemcraft/lang/zh_cn.json")),
                Map.class
        );
        listItems().forEach(file -> {
            if (file.isFile()) {
                var name = file.getName().replace(".json", "");
                var translat = translates.get("item.primogemcraft." + name);
                if (translat == null) translat = translates.get("block.primogemcraft." + name);
                System.out.printf("%s -> %s\n", name, translat);
            }
        });
        System.out.println(listItems().size() + " items");
    }
}
