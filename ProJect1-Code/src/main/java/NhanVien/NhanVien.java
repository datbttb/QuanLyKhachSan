/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NhanVien;

/**
 *
 * @author BV LAPTOP
 */
public class NhanVien {
    private String ma,ten,ngaysinh,gioitinh,cmt,sdt,diachi;

    public NhanVien() {
    }
 
    public NhanVien(String ma, String ten, String ngaysinh, String gioitinh, String cmt, String sdt, String diachi) {
        this.ma = ma;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.cmt = cmt;
        this.sdt = sdt;
        this.diachi = diachi;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getCmt() {
        return cmt;
    }

    public void setCmt(String cmt) {
        this.cmt = cmt;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    
    
    
    public String toString(){
        return ma+" "+ten+" "+ngaysinh+" "+gioitinh+" "+cmt+" "+sdt+" "+diachi;
    }
    
}
