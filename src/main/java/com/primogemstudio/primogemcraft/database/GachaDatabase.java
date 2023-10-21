package com.primogemstudio.primogemcraft.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class GachaDatabase {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:D:/test_gacha_data.db");
        conn.createStatement().executeUpdate("create table if not exists gacha_pity(id integer primary key autoincrement,username varchar(64),uuid varchar(32),pity5 integer, pity4 integer)");

    }
}
