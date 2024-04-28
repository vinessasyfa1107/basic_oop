public class Restoran {
    private String menu;
    private double harga;
    private boolean spesial;

    public String getMenu(){
        return menu;
    }
    public double getHarga(){
        return harga;
    }
    public boolean getspesial(){
        return spesial;
    }
    public void setMenu(String newMenu){
        menu = newMenu;
    }
    public void setHarga(double newHarga){
        harga = newHarga;
    }
    public void setSpesial(boolean newSpesial){
        spesial = newSpesial;
    }
}
