public class GiaoDich {
    private TaiKhoanNganHang taiKhoan;
    private double soTien;

    // Constructor
    public GiaoDich(TaiKhoanNganHang taiKhoan, double soTien) {
        this.taiKhoan = taiKhoan;
        this.soTien = soTien;
    }

    // Getter and Setter methods
    public TaiKhoanNganHang getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(TaiKhoanNganHang taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public double getSoTien() {
        return soTien;
    }

    public void setSoTienGiaoDich(double soTien) {
        this.soTien = soTien;
    }
    public void ThucHienGiaoDich(double soTien) {
        if (soTien <= taiKhoan.getSoDu()) {
            taiKhoan.setSoDu(taiKhoan.getSoDu() - soTien);
            System.out.println("Rut thanh cong, so du con: " + taiKhoan.getSoDu());
        } else {
            System.out.println("So du khong du");
        }
    }
}

