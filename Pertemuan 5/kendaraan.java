public class kendaraan {
    private String merk,warna;
    protected String namaClass = "Kendaraan";

    protected void setMerk(String merk){
        this.merk = merk;
        merk = null; // menghapus variabel parameter dari memori
    }

    protected String getMerk(){
        return merk;
    }

    protected void setWarna(String warna){
        this.warna = warna;
        warna = null; // menghapus variabel parameter dari memori
    }

    protected String getWarna(){
        return warna;
    }

    protected void tampil(String a){
        System.out.println(a);
        a = null;
    }

    protected String keterangan(){
        return ("Ini adalah class" +namaClass);
    }

    protected void hapus(){
        // menghapus variabel private dari memori
        warna = null;
        merk = null;
        namaClass = null;
    }
}
