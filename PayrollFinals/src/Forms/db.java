 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Forms;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author ZodiaDevias
 */
public class db {
    Connection conn = null;
    public static Connection java_db(){
        try{
            Class.forName("org.sqlite.JDBC");
            
            String filePathSql = "jdbc:sqlite:db.sqlite";
            
            Connection conn = DriverManager.getConnection(filePathSql);
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}
