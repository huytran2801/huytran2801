package Bai2;

public class HinhChuNhat implements TuGiac {
    private float chieudai;
    private float chieurong;

    @Override
    public void tinhDienTich() {
        float dientich = chieudai * chieurong;
        System.out.println(dientich);
    }

    @Override
    public float tinhChuVi() {
        float chuvi = (chieudai + chieurong) * 2;
        return chuvi;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println(chieudai);
        System.out.println(chieurong);
    }

    public HinhChuNhat() {

    }

    public HinhChuNhat(float chieudai, float chieurong) {
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }

    public float getChieudai() {
        return chieudai;
    }

    public void setChieudai(float chieudai) {
        this.chieudai = chieudai;
    }

    public float getChieurong() {
        return chieurong;
    }

    public void setChieurong(float chieurong) {
        this.chieurong = chieurong;
    }

    public void kiemTraHinhVuong () {
        if (chieudai == chieurong) {
            System.out.println("Day la hinh vuong");
        } else if (chieudai > chieurong) {
            System.out.println("Day la hinh chu nhat");
        }
    }
}

