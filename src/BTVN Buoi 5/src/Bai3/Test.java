package Bai3;

import Bai2.TuGiac;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Sach s = new Sach();
        TapChi tc1 = new TapChi();
        TapChi tc2 = new TapChi();
        Bao b1 = new Bao();
        Bao b2 = new Bao();

        ArrayList<TaiLieu> arr = new ArrayList<TaiLieu>();
        arr.add(s);
        arr.add(tc1);
        arr.add(tc2);
        arr.add(b1);
        arr.add(b2);

        s.soTrang = 500;
        s.tienInSach();

        tc1.thangPhatHanh = 5;
        tc1.chonMauTrangBia();

        tc2.thangPhatHanh = 9;
        tc2.chonMauTrangBia();
    }
}
