package demo.Book;

public class SachGiaoKhoa extends Sach {
    private String tinhTrang;

    public SachGiaoKhoa(int maSach, String tenSach, String tacGia, int namXuatBan, int giaTien, String tinhTrang) {
        super(maSach, tenSach, tacGia, namXuatBan, giaTien);
        this.tinhTrang = tinhTrang;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public int tinhGiaBan() {
        if (tinhTrang == "Mới") {
            return getGiaTien();
        } else if (tinhTrang == "Cũ") {
            return getGiaTien() * (50 / 100);
        }
        return 0;
    }

    public String hienThiGiaBan() {
        return hienThiThongTin()
                + "Giá bán: " + tinhGiaBan() + "\n";
    }
}
