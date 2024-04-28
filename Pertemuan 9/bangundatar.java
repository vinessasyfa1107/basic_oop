abstract class bangundatar {
    protected abstract double luas();

    protected abstract double keliling();
}
    class persegi extends bangundatar {
        private double sisi;

        public persegi(double sisi) {
            this.sisi = sisi;
        }

        @Override
        protected double luas() {
            double hasil = sisi * sisi;
            return hasil;
        }

        @Override
        protected double keliling() {
            double hasil = 4 * sisi;
            return hasil;
        }
    }

    class lingkaran extends bangundatar {
        private double jarijari;
        public lingkaran(double jarijari){
            this.jarijari = jarijari;
        }
        @Override
        protected double luas(){
            double hasil = Math.PI * jarijari * jarijari;
            return hasil;
        }
        @Override
        protected double keliling(){
            double hasil = 2 * Math.PI * jarijari;
            return hasil;
        }
    }

    class segitiga extends bangundatar {
        private double alas;
        private double tinggi;

        public segitiga(double alas, double tinggi){
            this.alas = alas;
            this.tinggi = tinggi;
        }
        @Override
        protected double luas(){
            double hasil = (alas * tinggi)/2;
            return hasil;
        }
        @Override
        protected double keliling(){
            double hasil = alas + tinggi;
            return hasil;
        }
    }



