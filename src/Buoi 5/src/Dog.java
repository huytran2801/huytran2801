public class Dog extends DongVat implements Runable {
    @Override
    public void keu() {
        System.out.println("Gau gau");
    }

    @Override
    public String traVeThucAn() {
        return "xuong";
    }

    @Override
    public void chay() {
        System.out.println("Toc do chay cua cho: " + tocdo);
    }

    @Override
    public void sleep() {
        System.out.println("Toi dang ngu");
    }
}
