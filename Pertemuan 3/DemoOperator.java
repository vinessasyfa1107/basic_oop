class DemoOperator {

    public static void main(String [] args){

        //Mendeklarasikan variabel test dengan tipe boolean
        //dan menginisialisasikan dengan false
        boolean test = false;

        //Membuat objek demo dari kelas DemoOperator
        DemoOperator demo = new DemoOperator();

        //Menggunakan operator instanceof untuk memeriksa
        //apakah demo merupakan instansi dari kelas DemoOperator
        test = (demo instanceof DemoOperator);

        // Menggunakan operator [] untuk membuat array namaHari
        // dengan tipe String
        String[] namaHari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};

        System.out.println("\nPROGRAM DEMO OPERATOR");
        System.out.println("---------------------\n");
        System.out.println("Apakah objek demo merupakan " + " instansi dari DemoOperator " + test);
        System.out.println("\nMencetak hari pertama" + "\t" + namaHari[0]);
        System.out.println("\nMencetak hari keempat" + "\t" + namaHari[3]);
    }
}
