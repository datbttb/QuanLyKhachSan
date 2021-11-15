/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KhachHang;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author BV LAPTOP
 */
public class KhachHangModifi {
    //thêm khách hàng
        public boolean insert(KhachHang kh) throws Exception {
        String sql = "insert into dbo.KhachHang (MaKH,Ten,GioiTinh,NgaySinh,CMND,QueQuan,SoDT,QuocTich) values(?,?,?,?,?,?,?,?)";
        try ( Connection cnn =KetNoi.openConnection();  PreparedStatement pstm = cnn.prepareStatement(sql);) {
            pstm.setString(1,kh.getMakh());
            pstm.setString(2,kh.getTen());
            pstm.setString(3,kh.getGioitinh());
            pstm.setString(4,kh.getNgaysinh());
            pstm.setString(5,kh.getCmnd());
            pstm.setString(6,kh.getQuequan());
            pstm.setString(7,kh.getSdt());
            pstm.setString(8,kh.getQuoctich());
            
            return pstm.executeUpdate()>0;
        }
    }
    
    // in tất cả các Khách hàng trong cơ sở dữ liệu
    public ArrayList<KhachHang> fillAll() throws Exception {
        String sql = "select * from dbo.KhachHang";
        ArrayList<KhachHang> kh=new ArrayList<>();
        try ( Connection cnn = KetNoi.openConnection();  PreparedStatement pstm = cnn.prepareStatement(sql);) {
            ResultSet rs=pstm.executeQuery();
            while(rs.next()){
                KhachHang kh1=new KhachHang();
                kh1.setMakh(rs.getString("MaKH"));
                kh1.setTen(rs.getString("Ten"));
                kh1.setGioitinh(rs.getString("GioiTinh"));
                kh1.setNgaysinh(rs.getString("NgaySinh"));
                kh1.setCmnd(rs.getString("CMND"));
                kh1.setQuequan(rs.getString("QueQuan"));
                kh1.setSdt(rs.getString("SoDT"));
                kh1.setQuoctich(rs.getString("QuocTich"));
                kh.add(kh1);
            }
        }
        return kh;
    }
    
    public ArrayList<KhachHang> fillTen(String ten) throws Exception {
        String sql = "select * from dbo.KhachHang where Ten=?";
        ArrayList<KhachHang> kh=new ArrayList<>();
        try ( Connection cnn = KetNoi.openConnection();  PreparedStatement pstm = cnn.prepareStatement(sql);) {
            pstm.setString(1,ten);
            ResultSet rs=pstm.executeQuery();
            while(rs.next()){
                KhachHang kh1=new KhachHang();
                kh1.setMakh(rs.getString("MaKH"));
                kh1.setTen(rs.getString("Ten"));
                kh1.setGioitinh(rs.getString("GioiTinh"));
                kh1.setNgaysinh(rs.getString("NgaySinh"));
                kh1.setCmnd(rs.getString("CMND"));
                kh1.setQuequan(rs.getString("QueQuan"));
                kh1.setSdt(rs.getString("SoDT"));
                kh1.setQuoctich(rs.getString("QuocTich"));
                kh.add(kh1);
            }
        }
        return kh;
    }
    
    // tìm kiếm Khách hàng theo mã
    
    public KhachHang fillMa(String ma) throws Exception {
        String sql = "select * from dbo.KhachHang where MaKH =? ";
        try ( Connection cnn =KetNoi.openConnection();  PreparedStatement pstm = cnn.prepareStatement(sql);) {
            pstm.setString(1,ma);
            ResultSet rs=pstm.executeQuery();
            if(rs.next()){
                KhachHang kh1=new KhachHang();
                kh1.setMakh(rs.getString("MaKH"));
                kh1.setTen(rs.getString("Ten"));
                kh1.setGioitinh(rs.getString("GioiTinh"));
                kh1.setNgaysinh(rs.getString("NgaySinh"));
                kh1.setCmnd(rs.getString("CMND"));
                kh1.setQuequan(rs.getString("QueQuan"));
                kh1.setSdt(rs.getString("SoDT"));
                kh1.setQuoctich(rs.getString("QuocTich"));
                return kh1;
            }
        }
        return null;
    }
    
// Xóa Khách Hàng theo mã số
    public boolean delete(KhachHang kh) throws Exception {
        String sql ="delete dbo.KhachHang where MaKH=?";
        try ( Connection cnn =KetNoi.openConnection();  PreparedStatement pstm = cnn.prepareStatement(sql);) {
            pstm.setString(1,kh.getMakh());     
            return pstm.executeUpdate()>0;
        }
    }
    
    // Cập nhật khách hàng
    public boolean update(KhachHang kh) throws Exception {
        String sql ="update dbo.KhachHang set Ten=?, GioiTinh=?, NgaySinh=?, CMND=?, QueQuan=?, SoDT=?, QuocTich=? where MaKH=?";
        try ( Connection cnn = NhanVien.KetNoi.openConnection();  PreparedStatement pstm = cnn.prepareStatement(sql);) {
            pstm.setString(1,kh.getTen());
            pstm.setString(2,kh.getGioitinh());
            pstm.setString(3,kh.getNgaysinh());
            pstm.setString(4,kh.getCmnd());
            pstm.setString(5,kh.getQuequan());
            pstm.setString(6,kh.getSdt());
            pstm.setString(7,kh.getQuoctich());
            pstm.setString(8,kh.getMakh());
            return pstm.executeUpdate()>0;
        }
    }
    
}

