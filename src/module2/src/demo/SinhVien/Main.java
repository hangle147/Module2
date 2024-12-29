package demo.SinhVien;

public class Main {
    public static void main(String[] args) {
        SinhVien[] sv = new SinhVien[3];
        sv[0] = new SinhVien(1,"Nguyễn Văn A", 7.5, 8.0, 9.0);
        sv[1] = new SinhVienChinhQuy(2,"Nguyễn Văn B", 1, 8.5, 9.0, 10.0);
        sv[2] = new SinhVienLienThong(3,"Nguyễn Văn C", 9.5, 10.0, 7.0);
        for (SinhVien sinhvien : sv) {
            System.out.println(sinhvien.hienThiThongTin());
        }
    }
}