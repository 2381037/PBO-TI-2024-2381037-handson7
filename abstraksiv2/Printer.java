package abstraksiv2;

public class Printer implements Cetak{
    @Override
    public void print() {
        System.out.println("mencetak  dokumen...");
    }

    @Override
    public void scan() {
        System.out.println("memindai dokumen...");
    }
}