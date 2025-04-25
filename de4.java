public class TaiKhoanNganHang {
    private String tenTaiKhoan;
    private double soDu;

    // Constructor
    public TaiKhoanNganHang(String tenTaiKhoan, double soDu) {
        this.tenTaiKhoan = tenTaiKhoan;
        this.soDu = soDu;
    }

    // Getter and Setter methods
    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public double getSoDu() {
        return soDu;
    }

    public void setSoDu(double soDu) {
        this.soDu = soDu;
    }
}
// public class main {
//     public static void main(String[] args) {
//         TaiKhoanNganHang taiKhoan = new TaiKhoanNganHang("Nguyen Van A", 1000000);
//         GiaoDich giaoDich = new GiaoDich(taiKhoan, 500000);
//         System.out.println("Ten tai khoan: " + taiKhoan.getTenTaiKhoan());
//         System.out.println("So du: " + taiKhoan.getSoDu());
//         giaoDich.rutTien(200000);
//         System.out.println("So du sau rut: " + taiKhoan.getSoDu());
//         giaoDich.rutTien(900000); // Thử rút số tiền lớn hơn số dư
//         System.out.println("So du sau rut: " + taiKhoan.getSoDu());
//     }
// }
