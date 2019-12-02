public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student("Huyen", 345, 7, 9);

        student.showInfo();

        student.diemTrungBinh();
        student.diemtoan = 10;
        student.diemTrungBinh();
    }
}
