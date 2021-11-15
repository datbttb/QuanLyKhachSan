/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phong;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.util.*;
import java.sql.*;
/**
 *
 * @author BV LAPTOP
 */
public class KetNoi {
    public static Connection openConnection() throws Exception{
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser("sa");
        ds.setPortNumber(1433);
        ds.setPassword("123456");
        ds.setServerName("DESKTOP-HK4KOQM\\SQLEXPRESS");
        ds.setDatabaseName("QLKhachSan");
        Connection cnn= ds.getConnection();
        return cnn;
                
    }
}
