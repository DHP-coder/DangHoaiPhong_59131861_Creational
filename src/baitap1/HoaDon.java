/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;
import java.util.ArrayList;
/**
 *
 * @author DangHoaiPhong
 */
public class HoaDon {
    HoaDonHeader hdHeader = new HoaDonHeader();
    ArrayList<CTHD> cthd = new ArrayList<>();
    
    public static class Builder {

        HoaDonHeader hdHeader;
        ArrayList<CTHD> cthd = new ArrayList<>();
        
        public Builder() {
        }
        
        public Builder addHeader(String maHoaDon, String tenKhachHang, String ngayBan) {
            this.hdHeader = new HoaDonHeader(maHoaDon, tenKhachHang, ngayBan);
            return this;
        }
        
        public Builder addCTHD(String tenSanPham, int soLuong, double donGia, float chietKhau) {
            CTHD chitiet = new CTHD(tenSanPham, soLuong, (float) donGia, chietKhau);
            this.cthd.add(chitiet);
            return this;
        }
        
        public HoaDon build() {
            return new HoaDon(this);
        }
    }
    
    protected HoaDon (Builder builder) {
        this.hdHeader = builder.hdHeader;
        this.cthd = builder.cthd;
    }
}
