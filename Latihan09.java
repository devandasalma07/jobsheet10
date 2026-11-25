import java.util.Arrays;
import java.util.Scanner;

public class Latihan09 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int jmlResponden = 10;
    int jmlPertanyaan = 6;
    int[][] survei = new int[jmlResponden][jmlPertanyaan];

    System.out.println("===Hasil survei (skala 1 - 5)===");
    for (int i = 0; i < survei.length; i++) {
        System.out.println("\nResponden ke-" + (i + 1));
        double totalResponden = 0;

        for (int j = 0; j < survei[i].length; j++) {
            System.out.print("Jawaban pertanyaan " + (j+1) + " (1-5): ");
            int nilai = sc.nextInt();

            while (nilai < 1 || nilai > 5) {
                System.out.print("Nilai tidak valid. Harap input angka 1-5: ");
                nilai = sc.nextInt();
            }
            survei[i][j] = nilai;
            totalResponden += survei[i][j];
        }
        double rataResponden = totalResponden/jmlPertanyaan;
        System.out.println("Rata-rata responden ke-" + (i+1) + ": " + rataResponden);
    }
    System.out.println("\n============================");
    System.out.println("Rata-rata nilai untuk setiap pertanyaan: ");
    for (int j = 0; j < jmlPertanyaan; j++) {
        double totalPertanyaan = 0;

        for (int i = 0; i < survei.length; i++) {
            totalPertanyaan += survei[i][j];
        }
        double rataPertanyaan = totalPertanyaan/jmlResponden;
        System.out.println("Pertanyaan" + (j+1) + ": " + rataPertanyaan);
      }
      sc.close();
    }
}
