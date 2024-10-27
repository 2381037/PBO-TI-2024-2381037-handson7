package enkapsulasi;

public class Main {
    public static void main(String[] args) {
        BankAccount andrewSimbolon = new BankAccount(100);
        andrewSimbolon.deposit(10);
        System.out.println(andrewSimbolon.getSaldo());
    }
}