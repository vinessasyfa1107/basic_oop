public class Makanan {
    public static void main(String args[]){
        Restoran rest = new Restoran();
        rest.setMenu("Ayam Goreng");
        rest.setHarga(17000);
        rest.setSpesial(true);

        System.out.println("Menu Makanan: " +rest.getMenu());
        System.out.println("Harga Makanan: " +rest.getHarga());
        System.out.println("Menu Spesial: " +rest.getspesial());
    }
}
