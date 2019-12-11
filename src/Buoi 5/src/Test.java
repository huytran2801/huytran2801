import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        DongVat dv1 = new Cat();
        DongVat dv2 = new Dog();

        dv1.keu();
        dv2.keu();
        System.out.println(dv1.traVeThucAn());
        System.out.println(dv2.traVeThucAn());
        ((Dog) dv2).chay();
        ((Dog) dv2).sleep();

        ArrayList<String> hoa = new ArrayList<String>();
        hoa.add("Hoa Hong");
        hoa.add("Hoa Lan");
        hoa.add("Hoa Hue");
        System.out.println(hoa);
        System.out.println(hoa.get(1));
        hoa.set(2, "Hoa Cuc");
        System.out.println(hoa);
        System.out.println(hoa.size());
        hoa.remove(0);
        System.out.println(hoa);
    }
}
