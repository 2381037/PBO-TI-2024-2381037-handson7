package abstraksi;

public class Mobil extends kendaraan{

    public Mobil(final String warna) {
        super(warna);
    }

    @Override
    void bergerak() {
        System.out.println("Mobil bergerak di jalan.");
    }
}