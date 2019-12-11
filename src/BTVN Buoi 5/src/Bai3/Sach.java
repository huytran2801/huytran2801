package Bai3;

public class Sach extends TaiLieu {
    public String tenTacGia;
    public int soTrang;
    public final int giaInSach = 200;

    public void tienInSach() {
        int tienInSach = soTrang * giaInSach;
        System.out.println("Tien in sach: " + tienInSach);
    }

    @Override
    public void hienThiThongTinTaiLieu() {

    }
}
