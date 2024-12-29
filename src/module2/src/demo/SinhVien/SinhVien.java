package demo.SinhVien;

public class SinhVien
        implements ITinhDiem, IHienThiThongTin {
    private int maSinhVien;
    private String hoTen;
    private double diemLTCpp;
    private double diemLTJava;
    private double diemLTWeb;
    public static int soLuongSinhVien = 0;

    public SinhVien(int maSinhVien, String hoTen, double diemLTCpp, double diemLTJava, double diemLTWeb) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.diemLTCpp = diemLTCpp;
        this.diemLTJava = diemLTJava;
        this.diemLTWeb = diemLTWeb;
        soLuongSinhVien++;
    }

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemLTCpp() {
        return diemLTCpp;
    }

    public void setDiemLTCpp(double diemLTCpp) {
        this.diemLTCpp = diemLTCpp;
    }

    public double getDiemLTJava() {
        return diemLTJava;
    }

    public void setDiemLTJava(double diemLTJava) {
        this.diemLTJava = diemLTJava;
    }

    public double getDiemLTWeb() {
        return diemLTWeb;
    }

    public void setDiemLTWeb(double diemLTWeb) {
        this.diemLTWeb = diemLTWeb;
    }

    @Override
    public double tinhDiemTrungBinh() {
        return (diemLTCpp + diemLTJava + diemLTWeb) / 3;
    }

    @Override
    public String hienThiThongTin() {
        return "Mã SV: " + maSinhVien + ", Họ tên: " + hoTen
                + "\nĐiểm trung bình: " + tinhDiemTrungBinh();
    }

    public static void hienThiThongTinSoLuong() {
        System.out.println("Tổng số sinh viên: " + soLuongSinhVien);
    }
}
