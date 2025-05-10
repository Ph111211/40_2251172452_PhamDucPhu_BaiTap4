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
