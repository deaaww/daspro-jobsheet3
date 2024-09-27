import java.util.Scanner;

public class GajiKaryawan08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int jumlahJam, upahPerJam;
        float persenBonus = 0.1f, persenPajak = 0.05f;

        System.out.println("Masukkan jumlah jam kerja: ");
        jumlahJam = sc.nextInt();
        System.out.println("Masukkan upah kerja per jam: ");
        upahPerJam = sc.nextInt();

        int totalGaji = jumlahJam * upahPerJam;
        float bonus = persenBonus * totalGaji;
        int totalGajiPlusBonus = totalGaji + (int)persenBonus;
        float pajak = persenPajak * totalGajiPlusBonus;
        int gajiBersih = totalGajiPlusBonus - (int)pajak;

        System.out.println("Total gaji: " + totalGaji);
        System.out.println("Bonus: " + bonus);
        System.out.println("Pajak: " + pajak);
        System.out.println("Gaji bersih yang didapatkan yaitu: " + gajiBersih);

        sc.close();
    }
}