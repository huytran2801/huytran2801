package Bai1;

public abstract class PhuongTienGiaoThong {
    protected String hang;
    protected int tocDo;
    protected String mau;
    protected double hour;

    public PhuongTienGiaoThong() {

    }

    public PhuongTienGiaoThong(String hang, int tocDo, String mau, double hour) {
        this.hang = hang;
        this.tocDo = tocDo;
        this.mau = mau;
        this.hour = hour;
    }

    public abstract void phanh();

    public abstract void chay();

    public double tinhQuangDuong() {
        double quangduong = tocDo * hour;
        return quangduong;
    }
}
