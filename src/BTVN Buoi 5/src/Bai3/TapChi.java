package Bai3;

public class TapChi extends TaiLieu {
    public int soPhatHanh;
    public int thangPhatHanh;

    public void chonMauTrangBia() {
        if (thangPhatHanh == 1 || thangPhatHanh == 2 || thangPhatHanh == 3) {
            System.out.println("Mau Trang Bia: Mau Do");
        } else if (thangPhatHanh == 4 || thangPhatHanh == 5 || thangPhatHanh == 6) {
            System.out.println("Mau Trang Bia: Mau Xanh");
        } else if (thangPhatHanh == 7 || thangPhatHanh == 8 || thangPhatHanh == 9) {
            System.out.println("Mau Trang Bia: Mau Vang");
        } else if (thangPhatHanh == 10 || thangPhatHanh == 11 || thangPhatHanh == 12) {
            System.out.println("Mau Trang Bia: Mau Tim");
        }
    }

    @Override
    public void hienThiThongTinTaiLieu() {

    }
}
