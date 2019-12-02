public class Student {
     String name;
    public int mahocsinh;
    public int diemtoan;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMahocsinh() {
        return mahocsinh;
    }

    public void setMahocsinh(int mahocsinh) {
        this.mahocsinh = mahocsinh;
    }

    public int getDiemtoan() {
        return diemtoan;
    }

    public void setDiemtoan(int diemtoan) {
        this.diemtoan = diemtoan;
    }

    public int getDiemvan() {
        return diemvan;
    }

    public void setDiemvan(int diemvan) {
        this.diemvan = diemvan;
    }

    public int diemvan;

    public void showInfo() {
        System.out.println(name);
        System.out.println(mahocsinh);
        System.out.println(diemtoan);
        System.out.println(diemvan);
    }

    public void diemTrungBinh() {
        int diemTrungBinh = (diemtoan + diemvan) / 2;
        System.out.println(diemTrungBinh);
    }

    public Student() {

    }

    public Student(String name, int mahocsinh, int diemtoan, int diemvan) {
        this.name = name;
        this.mahocsinh = mahocsinh;
        this.diemtoan = diemtoan;
        this.diemvan = diemvan;
    }
}
