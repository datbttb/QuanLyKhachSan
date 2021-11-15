/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KhachHang;

import java.util.ArrayList;

/**
 *
 * @author BV LAPTOP
 */
public class Test {
    public static void main(String[] args) throws Exception {
        KhachHang kh1=new KhachHang();
        kh1.setMakh("7");
        kh1.setTen("Nguyen Van Hoang");
        kh1.setGioitinh("Nam");
        kh1.setNgaysinh("20011002");
        kh1.setCmnd("131241241");
        kh1.setQuequan("Ha Noi");
        kh1.setSdt("012312312");
        kh1.setQuoctich("Viet Nam");
        KhachHangModifi khm=new KhachHangModifi();
        //--themvao
        //khm.insert(kh1);
        
        //--Tin theo tên
        /*ArrayList<KhachHang> kh=khm.fillTen("Nguyen Dinh Dat");
        for(KhachHang kh2:kh){
            System.out.println(kh2);
        }*/
        
        //--Tìm theo Ma
        /*KhachHang kh3=khm.fillMa("7");
        System.out.println(kh3);*/
        
        //--Xoa khach hang:
        //khm.delete(kh1);
        
        //--CapNhat:
        kh1.setNgaysinh("20010824");
        khm.update(kh1);
               
    }
}
