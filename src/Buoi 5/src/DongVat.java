public abstract class DongVat {
        protected String ten;
        protected String loai;
        protected int tuoi;

        public DongVat() {

        }

        public DongVat(String ten, String loai, int tuoi) {
            this.ten = ten;
            this.loai = loai;
            this.tuoi = tuoi;
        }

        public String getTen() {
            return ten;
        }

        public void setTen(String ten) {
            this.ten = ten;
        }

        public String getLoai() {
            return loai;
        }

        public void setLoai(String loai) {
            this.loai = loai;
        }

        public int getTuoi() {
            return tuoi;
        }

        public void setTuoi(int tuoi) {
            this.tuoi = tuoi;
        }

        public abstract void keu();

        public abstract String traVeThucAn();
}
