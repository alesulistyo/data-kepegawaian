/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author alessandro
 */
public class connection {
    static Connection mysqlconfig;
    static Statement mysqlstm;
    public Connection configDB() {
        try {
            String url = "jdbc:mysql://localhost:3306/datakepegawaian?serverTimezone=UTC";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            mysqlconfig = DriverManager.getConnection(url, user, pass);
            mysqlstm = mysqlconfig.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Anda tidak terhubung dengan database!\n"+e);
        }
        return mysqlconfig;
    }
}
