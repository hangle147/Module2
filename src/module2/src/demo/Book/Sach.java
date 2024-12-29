package demo.Book;

public class Sach {
    private int maSach;
    private String tenSach;
    private String tacGia;
    private int namXuatBan;
    private int giaTien;

    public Sach(int maSach, String tenSach, String tacGia, int namXuatBan, int giaTien) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.giaTien = giaTien;
    }

    public int getMaSach() {
        return maSach;
    }

    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    public int getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String hienThiThongTin() {
        return "Thông tin sách " + tenSach + ": "
                + ", Mã sách: " + maSach
                + ", Tác giả: " + tacGia
                + ", Năm xuất bản: " + namXuatBan
                + ", Giá tiền: " + giaTien + "\n";
    }
}