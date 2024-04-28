public class Laptop {
    String cekInfo(){
        return "Laptop Lenovo milik saya";
    }
}

class BelajarJava {
    public static void main(String args[]){
        Laptop laptopSaya = new Laptop();
        System.out.println(laptopSaya.cekInfo());
    }
}