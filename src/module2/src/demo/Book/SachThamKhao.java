package demo.Book;

public class SachThamKhao extends Sach {
    private int thue;

    public SachThamKhao(int maSach, String tenSach, String tacGia, int namXuatBan, int giaTien, int thue) {
        super(maSach, tenSach, tacGia, namXuatBan, giaTien);
        this.thue = thue;
    }

    public int getThue() {
        return thue;
    }

    public void setThue(int thue) {
        this.thue = thue;
    }

    public int tinhGiaBan() {
        return getGiaTien() + thue;
    }

    public String hienThiGiaBan() {
        return hienThiThongTin()
                + "Giá bán: " + tinhGiaBan() + "\n";
    }
}
