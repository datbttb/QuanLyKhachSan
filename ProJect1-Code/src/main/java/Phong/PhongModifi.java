/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phong;
import java.sql.*;
import java.util.*;
/**
 *
 * @author BV LAPTOP
 */
public class PhongModifi {
    public boolean insert(Phong p) throws Exception {
        String sql = "insert dbo.Phong (Maphong,Loaiphong,Giaphong,Chuthich,Tinhtrang) values (?,?,?,?,?)";
            try (Connection cnn=KetNoi.openConnection(); PreparedStatement pst= cnn.prepareStatement(sql);){
                
        }
    }
}
