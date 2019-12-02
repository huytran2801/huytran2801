public class Dog {
    // Khai bao thuoc tinh
    public String name;
    public int age = 10;
    public String color;
    public String species;

    // Khai bao phuong thuc
    public void eat(String food) {
        System.out.println("Dog is eating " + food);
    }
    public void sleep () {
        System.out.println("Dog is sleeping");
    }
    public String bark() {
        return "Gau gau";
    }
    public void run () {
        System.out.println("Dog is running");
    }
    public void calYear () {
        int year = 2019 - this.age;
        System.out.println(year);
    }
}
