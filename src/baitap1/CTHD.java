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
public class CTHD {
    String sanPham;
    int soLuong;
    double donGia, chietKhau;

    public CTHD(String sanPham, int soLuong, float donGia, float chietKhau) {
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }

    String getTenSanPham() {
        return sanPham;
    }

    int getSoLuong() {
        return soLuong;
    }

    double getChietKhau() {
        return chietKhau;
    }

    double getDonGia() {
        return donGia;
    }
    
    
}
