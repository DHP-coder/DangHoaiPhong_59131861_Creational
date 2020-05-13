/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

/**
 *
 * @author DangHoaiPhong
 */
public class HoaDonHeader {
    String maHD, ngayBan, tenKH;

    public HoaDonHeader(String maHD, String ngayBan, String tenKH) {
        this.maHD = maHD;
        this.ngayBan = ngayBan;
        this.tenKH = tenKH;
    }

    HoaDonHeader() {
    }

    String getMaHoaDon() {
        return maHD;
    }

    String getTenKhachHang() {
        return tenKH;
    }

    String getNgayBan() {
        return ngayBan;
    }
    
}
