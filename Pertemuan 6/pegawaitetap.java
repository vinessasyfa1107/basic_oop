import java.time.*;

    public class pegawaitetap extends pegawai {
        String npk;
        pegawaitetap(String id, String nama, int golongan, LocalDate tgllhr, String npk){
            super(id, nama, golongan, tgllhr);
            this.npk = npk;
        }

        long tunjanganpegawai(){
            long tunjanganpegawai = 1500000;
            return tunjanganpegawai;
        }


        long tunjanganfungsional(){
            long tunjanganfungsional;
            if (this.hitungusia() < 40){
                tunjanganfungsional = 1700000;
            } else {
                tunjanganfungsional = 2000000;
            }

            return tunjanganfungsional;
        }

        long totalgaji(){
            long total = this.hitunggajipokok() + this.tunjanganpegawai() + this.tunjanganfungsional();
            return total;
        }

        void printpegawai(){
            System.out.println("ID Pegawai   : " + this.idpegawai);
            System.out.println("Nama Pegawai : " + this.nama);
            System.out.println("Golongan     : " + this.golongan);
            System.out.println("Tanggal Lahir    : " + this.tglLahir);
            System.out.println("NPK         : " + this.npk);
            System.out.println("Usia         : " + this.hitungusia() + " tahun");
            System.out.println("Gaji Pokok   : Rp " + this.hitunggajipokok());
            System.out.println("Tunjangan Pegawai : Rp " + this.tunjanganpegawai());
            System.out.println("Tunjangan Fungsional  : Rp " + this.tunjanganfungsional());
            System.out.println("Total Gaji   : Rp " + this.totalgaji());
        }
    }

