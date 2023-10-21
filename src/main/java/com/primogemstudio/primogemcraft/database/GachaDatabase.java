package com.primogemstudio.primogemcraft.database;

import java.sql.*;

public class GachaDatabase {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:D:/test_gacha_data.db");
        Statement statement = conn.createStatement();
        statement.executeUpdate("create table if not exists gacha_pity(id integer primary key autoincrement unique,username varchar(64) unique,uuid varchar(36) unique,pity5 integer,pity4 integer)");
        statement.executeUpdate("create table if not exists gacha_history(id integer primary key autoincrement unique,username varchar(64),uuid varchar(36),timestamp long, level integer,item varchar(2048))");
        statement.execute("delete from gacha_pity");
        statement.close();

        PreparedStatement state = conn.prepareStatement("insert into gacha_pity(username,uuid,pity5,pity4) values(?,?,?,?)");
        state.setString(1, "Coder2");
        state.setString(2, "test");
        state.setInt(3, 4);
        state.setInt(4, 4);
        state.executeUpdate();

        ResultSet rs = conn.createStatement().executeQuery("select * from gacha_pity");
        while (rs.next()) {
            System.out.printf("%s, %s, %s, %s\n", rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5));
        }
    }
}
