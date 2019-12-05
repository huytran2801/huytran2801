public class Student {
    private String mahocsinh;
    private String lop;
    private float diemtoan;
    private float diemvan;
    private float diemanh;

    public Student() {

    }

    public String getMahocsinh() {
        return mahocsinh;
    }

    public void setMahocsinh(String mahocsinh) {
        this.mahocsinh = mahocsinh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public float getDiemtoan() {
        return diemtoan;
    }

    public void setDiemtoan(float diemtoan) {
        this.diemtoan = diemtoan;
    }

    public float getDiemvan() {
        return diemvan;
    }

    public void setDiemvan(float diemvan) {
        this.diemvan = diemvan;
    }

    public float getDiemanh() {
        return diemanh;
    }

    public void setDiemanh(float diemanh) {
        this.diemanh = diemanh;
    }

    public Student(String mahocsinh, String lop, float diemtoan, float diemvan, float diemanh) {
        this.mahocsinh = mahocsinh;
        this.lop = lop;
        this.diemtoan = diemtoan;
        this.diemvan = diemvan;
        this.diemanh = diemanh;
    }

    public void showinfo() {
        System.out.println(mahocsinh);
        System.out.println(lop);
        System.out.println(diemtoan);
        System.out.println(diemvan);
        System.out.println(diemanh);
    }

    public void averageScore() {
        float averageScore = ((diemtoan + diemvan) * 2 + diemanh) / 3;
        System.out.println(averageScore);
    }

    public void showRank() {
        if (8.5 <= diemtoan && diemtoan <= 10) {
            System.out.println("Hoc luc mon toan: A");
        } else if (7.0 <= diemtoan && diemtoan < 8.5) {
            System.out.println("Hoc luc mon toan: B");
        } else if (5.5 <= diemtoan && diemtoan < 7.0) {
            System.out.println("Hoc luc mon toan: C");
        } else if (4.0 <= diemtoan && diemtoan < 5.5) {
            System.out.println("Hoc luc mon toan: D");
        } else if (diemtoan < 4) {
            System.out.println("Hoc luc mon toan: F");
        }
    }
}
