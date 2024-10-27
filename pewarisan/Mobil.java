package pewarisan;

public class Mobil extends Kendaraan{
    private int jumlahPintu;
    private String jenisBahanBakar;

    public Mobil(String merk, String model, int tahunProduksi,final  int jumlahPintu, final String jenisBahanBakar) {
        super(merk, model, tahunProduksi);
        this.jumlahPintu = jumlahPintu;
        this.jenisBahanBakar = jenisBahanBakar;
    }
    public void infoMobil(){
        infoKendaraan();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
        System.out.println("Jenis Bahan Bakar: " + jenisBahanBakar);
    }
}