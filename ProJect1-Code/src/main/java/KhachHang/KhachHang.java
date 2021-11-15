/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KhachHang;

/**
 *
 * @author BV LAPTOP
 */
public class KhachHang {
    private String makh,ten,gioitinh,ngaysinh, cmnd ,quequan ,sdt ,quoctich;

    public KhachHang(String makh, String ten, String gioitinh, String ngaysinh, String cmnd, String quequan, String sdt, String quoctich) {
        this.makh = makh;
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.cmnd = cmnd;
        this.quequan = quequan;
        this.sdt = sdt;
        this.quoctich = quoctich;
    }

    public KhachHang() {
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public String getQuoctich() {
        return quoctich;
    }

    public void setQuoctich(String quoctich) {
        this.quoctich = quoctich;
    }
    
    @Override
    public String toString(){
        return makh+" "+ten+" "+gioitinh+" "+ngaysinh+" "+cmnd+" "+quequan+" "+sdt+" "+quoctich;
    }
    
}
