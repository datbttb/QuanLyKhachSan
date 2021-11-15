/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NhanVien;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author BV LAPTOP
 */
public class NhanVienModifi {
    // thêm nhân viên vào cơ sở dữ liệu
    public boolean insert(NhanVien nv) throws Exception {
        String sql = "insert into dbo.NhanVien (Ma,Ten,Ngaysinh,Gioitinh,CMT,SDT,Quequan) values(?,?,?,?,?,?,?)";
        try ( Connection cnn = KetNoi.openConnection();  PreparedStatement pstm = cnn.prepareStatement(sql);) {
            pstm.setString(1,nv.getMa());
            pstm.setString(2,nv.getTen());
            pstm.setString(3,nv.getNgaysinh());
            pstm.setString(4,nv.getGioitinh());
            pstm.setString(5,nv.getCmt());
            pstm.setString(6,nv.getSdt());
            pstm.setString(7,nv.getDiachi());
            
            return pstm.executeUpdate()>0;
        }
    }
    
    // in tất cả các nhân viên trong cơ sở dữ liệu
    public ArrayList<NhanVien> fillAll() throws Exception {
        String sql = "select * from dbo.NhanVien";
        ArrayList<NhanVien> nv=new ArrayList<>();
        try ( Connection cnn = KetNoi.openConnection();  PreparedStatement pstm = cnn.prepareStatement(sql);) {
            ResultSet rs=pstm.executeQuery();
            while(rs.next()){
                NhanVien nv1=new NhanVien();
                nv1.setMa(rs.getString("Ma"));
                nv1.setTen(rs.getString("Ten"));
                nv1.setNgaysinh(rs.getString("Ngaysinh"));
                nv1.setGioitinh(rs.getString("Gioitinh"));
                nv1.setCmt(rs.getString("CMT"));
                nv1.setSdt(rs.getString("SDT"));
                nv1.setDiachi(rs.getString("Quequan"));
                nv.add(nv1);
            }
        }
        return nv;
    }
    
    // tìm kiếm nhân viên theo mã
    
    public NhanVien fillMa(String ma) throws Exception {
        String sql = "select * from dbo.NhanVien where Ma =? ";
        try ( Connection cnn = KetNoi.openConnection();  PreparedStatement pstm = cnn.prepareStatement(sql);) {
            pstm.setString(1,ma);
            ResultSet rs=pstm.executeQuery();
            if(rs.next()){
                NhanVien nv1=new NhanVien();
                nv1.setMa(rs.getString("Ma"));
                nv1.setTen(rs.getString("Ten"));
                nv1.setNgaysinh(rs.getString("Ngaysinh"));
                nv1.setGioitinh(rs.getString("Gioitinh"));
                nv1.setCmt(rs.getString("CMT"));
                nv1.setSdt(rs.getString("SDT"));
                nv1.setDiachi(rs.getString("Quequan"));
                return nv1;
            }
        }
        return null;
    }
    
// Xóa nhân viên theo mã số
    public boolean delete(String ma) throws Exception {
        String sql ="delete dbo.NhanVien where Ma=?";
        try ( Connection cnn = KetNoi.openConnection();  PreparedStatement pstm = cnn.prepareStatement(sql);) {
            pstm.setString(1,ma);     
            return pstm.executeUpdate()>0;
        }
    }
    
    public boolean update(NhanVien nv) throws Exception {
        String sql ="update dbo.NhanVien set  where Ma=?";
        try ( Connection cnn = KetNoi.openConnection();  PreparedStatement pstm = cnn.prepareStatement(sql);) {
            pstm.setString(1,nv.getMa());
            
            return pstm.executeUpdate()>0;
        }
    }
    
}
/*
Ma,Ten,Ngaysinh,Gioitinh,CMT,SDT,Quequan
 */
