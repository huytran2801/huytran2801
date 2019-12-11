package Bai2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat(19,14);
        hcn.tinhDienTich();
        hcn.kiemTraHinhVuong();
        hcn.tinhChuVi();

        HinhVuong hv = new HinhVuong(23);
        hv.tinhDienTich();
        hv.tinhChuVi();

        ArrayList<TuGiac> arr = new ArrayList<TuGiac>();
        arr.add(hcn);
        arr.add(hv);
        if (hcn.tinhChuVi() > hv.tinhChuVi()) {
            System.out.println(hcn.tinhChuVi());
        } else if (hcn.tinhChuVi() < hv.tinhChuVi()) {
            System.out.println(hv.tinhChuVi());
        }
    }
}

