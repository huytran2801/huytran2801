package Bai1;

public class Car extends PhuongTienGiaoThong {
    private String dongCo;

    public Car(){

    }

    public Car(String hang, int tocDo, String mau, double hour, String dongCo) {
        super(hang, tocDo, mau, hour);
        this.dongCo = dongCo;
    }

    public String getDongCo() {
        return dongCo;
    }

    public void setDongCo(String dongCo) {
        this.dongCo = dongCo;
    }

    @Override
    public void phanh() {
        System.out.println("Car da dung");
    }

    @Override
    public void chay() {
        System.out.println("Car dang di");
    }

    public void showInfo() {
        System.out.println(hang);
        System.out.println(tocDo);
        System.out.println(mau);
        System.out.print(hour);
        System.out.println(dongCo);
    }
}
