package demo.SinhVien;

public class SinhVienChinhQuy extends SinhVien {
    public int maLop;

    public SinhVienChinhQuy(int maSinhVien, String hoTen, int maLop, double diemLTCpp, double diemLTJava, double diemLTWeb) {
        super(maSinhVien, hoTen, diemLTCpp, diemLTJava, diemLTWeb);
        this.maLop = maLop;
    }

    public int getMaLop() {
        return maLop;
    }

    public void setMaLop(int maLop) {
        this.maLop = maLop;
    }

    @Override
    public double tinhDiemTrungBinh() {
        return  super.tinhDiemTrungBinh();
    }

    @Override
    public String hienThiThongTin() {
        return "Mã lớp: " + maLop + "\n"
                + super.hienThiThongTin();
    }
}
