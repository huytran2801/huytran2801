package Bai1;

public class Bike extends PhuongTienGiaoThong {
    public Bike() {

    }

    public Bike(String hang, int tocDo, String mau, double hour){
        super(hang, tocDo, mau, hour);
    }

    @Override
    public void phanh() {
        System.out.println("Bike đã dừng");
    }

    @Override
    public void chay() {
        System.out.println("Bike dang di");
    }
}
