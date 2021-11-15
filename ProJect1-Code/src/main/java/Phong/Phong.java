/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phong;
import java.util.Date;

/**
 *
 * @author BV LAPTOP
 */
public class Phong {
    private String maphong , loaiphong , chuthich ;
    private int tinhtrang;

    public Phong(String maphong, String loaiphong, String chuthich, int tinhtrang) {
        this.maphong = maphong;
        this.loaiphong = loaiphong;
        this.chuthich = chuthich;
        this.tinhtrang = tinhtrang;
    }

    public String getMaphong() {
        return maphong;
    }

    public void setMaphong(String maphong) {
        this.maphong = maphong;
    }

    public String getLoaiphong() {
        return loaiphong;
    }

    public void setLoaiphong(String loaiphong) {
        this.loaiphong = loaiphong;
    }

    public String getChuthich() {
        return chuthich;
    }

    public void setChuthich(String chuthich) {
        this.chuthich = chuthich;
    }

    public int getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(int tinhtrang) {
        this.tinhtrang = tinhtrang;
    }
    
}
