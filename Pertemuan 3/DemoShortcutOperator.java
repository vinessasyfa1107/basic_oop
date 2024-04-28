public class DemoShortcutOperator {
    public static void main(String [] args){
        int a = 2, hasil;

        System.out.println("\nPROGRAM DEMO SHORTCUT OPEARTOR");
        System.out.println("-------------------------------\n");

        System.out.println("Nilai awal a = " + a);

        //ShortcutOperator
        a += 3; //Nilai a menjadi 2 + 3 = 5
        System.out.println("\nShortcut Operator a += 3" + "menghasilkan : " + a);

        a *= 3; //Nilai a menjadi 5 x 3 = 15
        System.out.println("\nShortcut Operator a *= 3 " + "menghasilkan : " + a);

        //Postincremental
        System.out.println("\nNilai variabel a sebelum " + "PostIncremental = " + a);

        hasil = 3*(a++); //Nilai hasil = 3 x 15 = 45

        System.out.println("Hasil PostIncremental 3*(a++)" + hasil);
        System.out.println("Nilai variabel a setelah " + "PostIncremental = " + a);

        //Preincremental
        System.out.println("\nNilai variabel a sebelum " + "Preincremental = " + a); //a = 16

        hasil = 3*(++a); //{Nilai hasil = 3 x (16+1) = 51

        System.out.println("Hasil Preincremental 3*(++a) = " + hasil);
        System.out.println("Nilai variabel a setelah " + "PreIncremental = " + a); //a = 17

        //Postdecremental
        System.out.println("\nNilai variabel a sebelum " + "Postdecremental = " + a); //a = 17

        hasil = 3*(a--); //{nilai hasil = 3 x (17) = 48

        System.out.println("Hasil Postdecremental 3*(a--) = " + hasil);
        System.out.println("\nNilai variabel a setelah " + "PostDecremental = " + a); //a = 16

        //Predecremental (Nilai hasil 3 x (414-1))
        System.out.println("\nNilai variabel a sebelum " + "Predecremental = " + a); //a = 16
        hasil = 3*(a--); //Nilai hasil = 3 x (16-1) = 45

        System.out.println("Hasil PostDecremental 3*(--a) = " + hasil);
        System.out.println("Nilai variabel a setelah " + "Predecremental = " + a); //a = 15

    }
}
