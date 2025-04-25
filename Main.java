public class Main {
     public static void main(String[] args) {
         TaiKhoanNganHang taiKhoan = new TaiKhoanNganHang("Pham Duc Phu", 1000000);
         GiaoDich giaoDich = new GiaoDich(taiKhoan, 500000);
         System.out.println("Ten tai khoan: " + taiKhoan.getTenTaiKhoan());
         System.out.println("So du: " + taiKhoan.getSoDu());
         giaoDich.rutTien(200000);
         giaoDich.rutTien(900000); 
     }
}
 
