package Bai2;

public class HinhVuong implements TuGiac {
    private float canh;

    @Override
    public void tinhDienTich() {
        float dientich = canh*canh;
        System.out.println(dientich);
    }

    @Override
    public float tinhChuVi() {
        float chuvi = canh*4;
        return chuvi;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println(canh);
    }

    public HinhVuong() {

    }

    public HinhVuong(float canh) {
        this.canh = canh;
    }

    public float getCanh() {
        return canh;
    }

    public void setCanh(float canh) {
        this.canh = canh;
    }
}

