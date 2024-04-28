public class mobil extends kendaraan{
    private long harga;
    protected String namaClass = "Mobil";

    protected void setHarga(String harga){
        this.harga = Long.parseLong(harga);
        harga = null;
    }

    protected long getHarga(){
        return harga;
    }

    protected String keterangan(){
        return (namaClass+" : Ini adalah class "+namaClass);
    }

    public String keterangan_kendaraan(){
        //mengakses atribut/varianel & method parent (class kendaraan)
        return super.namaClass+" : "+super.keterangan();
    }

    protected void hapus(){
        //menghapus variabel private dari memori
        harga = 0;
        //menghapus variabel private parent (class kendaraan)
        super.hapus();
    }
}
