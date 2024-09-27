import java.util.Scanner;

public class TagihanListrik08 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double tarifPerKwh = 1500;
        double penggunaanListrik;
        double totalTagihan;

        System.out.println("Masukkan jumlah penggunaan listrik (kwh): ");
        penggunaanListrik = sc.nextDouble();

        totalTagihan = penggunaanListrik * tarifPerKwh;
        boolean melebihi500kwh = penggunaanListrik > 500;

        System.out.println("Total tagihan listrik: Rp " + totalTagihan);
        if (melebihi500kwh) {
            System.out.println("Penggunaan listrik melebihi 500 kwh. ");
        } else {
            System.out.println("Penggunaan listrik tidak melebihi 500 kwh. ");
        }
        sc.close();
    }
        
}