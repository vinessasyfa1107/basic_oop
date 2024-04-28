public class MethodOverload {

    public void kuadrat(int angka){
        int hasil;
        hasil = angka * angka;
        System.out.println("Kuadrat dari "+angka+" adalah " +hasil);
    }

    public void kuadrat(double angka){
        double hasil;
        hasil = angka * angka;
        System.out.println("Kuadrat dari "+angka+" adalah " +hasil);
    }
}
