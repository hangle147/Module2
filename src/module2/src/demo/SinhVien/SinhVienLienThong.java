package demo.SinhVien;

public class SinhVienLienThong extends SinhVien {
    public SinhVienLienThong(int maSinhVien, String hoTen, double diemLTCpp, double diemLTJava, double diemLTWeb) {
        super(maSinhVien, hoTen, diemLTCpp, diemLTJava, diemLTWeb);
    }

    @Override
    public double tinhDiemTrungBinh() {
        return (getDiemLTCpp() + getDiemLTJava()) /  2;
    }

    @Override
    public String hienThiThongTin() {
        return super.hienThiThongTin();
    }
}
