public class tampilbangundatar {
    public static void main(String[] args){
        persegi Persegi = new persegi(4);
        lingkaran Lingkaran = new lingkaran(50);
        segitiga Segitiga = new segitiga(6, 3);

        System.out.println("Luas Persegi: " +Persegi.luas());
        System.out.println("Keliling Persegi: " +Persegi.keliling());
        System.out.println("Luas Segitiga: " +Segitiga.luas());
        System.out.println("Luas Lingkaran: " +Lingkaran.luas());
        System.out.println("Keliling Lingkaran: " +Lingkaran.keliling());
    }
}
