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
public class BT1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HoaDon hoaDon = new HoaDon.Builder()
                .addHeader("HD01", "Dang Hoai Phong", "1/1/2020")
                .addCTHD("Tu lanh", 1, 10000000, 0.1F)
                .build();
        
        System.out.println("Mã hóa đơn: " + hoaDon.hdHeader.getMaHoaDon() + "\n" +
                            "Tên khách hàng: " + hoaDon.hdHeader.getTenKhachHang() + "\n" +
                            "Ngày bán: " + hoaDon.hdHeader.getNgayBan() + "\n");
        
        System.out.println("Thông tin chi tiết hóa đơn ");
        
        for(CTHD x : hoaDon.cthd)  
        {
        System.out.println("Tên sản phẩm: " + x.getTenSanPham() + "\n"
                                + "Số lượng: " + x.getSoLuong() + "\n"
                                + "Đơn giá: " + x.getDonGia() + "\n"
                                + "Chiết khấu: " + x.getChietKhau() + "\n");
        }
    }
}
