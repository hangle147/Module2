package demo.Book;

public class Main {
    public static void main(String[] args) {
        SachGiaoKhoa[] sgk = new SachGiaoKhoa[4];
        sgk[0] = new SachGiaoKhoa(1, "ABC", "abc", 2024, 25, "Mới");
        sgk[1] = new SachGiaoKhoa(2, "BCD", "bcd", 2023, 23, "Cũ");
        sgk[2] = new SachGiaoKhoa(3, "DEF", "def", 2022, 30, "Mới");
        sgk[3] = new SachGiaoKhoa(4, "FGH", "fgh", 2021, 40, "Cũ");

        SachThamKhao[] stk = new SachThamKhao[4];
        stk[0] = new SachThamKhao(1, "abc", "ABC", 2021, 25, 2);
        stk[1] = new SachThamKhao(2, "bcd", "BCD", 2022, 23, 1);
        stk[2] = new SachThamKhao(3, "def", "DEF", 2023, 30, 2);
        stk[3] = new SachThamKhao(4, "fgh", "FGH", 2024, 40, 1);

        for (SachGiaoKhoa sachgiaokhoa : sgk) {
            System.out.println(sachgiaokhoa.hienThiGiaBan());
        }
        for (SachThamKhao sachThamKhao : stk) {
            System.out.println(sachThamKhao.hienThiGiaBan());
        }
    }
}
