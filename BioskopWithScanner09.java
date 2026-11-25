import java.util.Scanner;
import java.util.Arrays;

public class BioskopWithScanner09 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[][] penonton = new String[4][2];
    int baris, kolom, menu;
    String nama, next;

    while (true) {
        System.out.println("===== menu bioskop =====");
        System.out.println("1. input data penonton");
        System.out.println("2. Tampilan daftar penonton");
        System.out.println("3. Exit");
        System.out.print("Pilih menu (1/2/3): ");
        menu = sc.nextInt();
        sc.nextLine();

        switch (menu) {
            case 1:
                while(true) {
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();

                    while (true) {
                        System.out.print("Masukkan baris (1-" + penonton.length + "): ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom (1-" + penonton[0].length + "): ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        if (baris < 1 || baris > penonton.length || kolom < 1 || kolom > penonton[0].length) {
                            System.out.println("Nomor baris atau kolom tidak tersedia, silahkan input kembali.");
                            continue;
                        }
                    
                    if (penonton[baris-1][kolom-1] != null ) {
                        System.out.println("Kursi baris" + baris + " kolom " + kolom + " sudah terisi oleh" + 
                        penonton[baris-1][kolom-1] + ". Silahkan masukkan baris dan kolom yang masih tersedia");
                        continue;
                    }
                    break;
                }

                penonton[baris-1][kolom-1] = nama;

                System.out.print("Input penonton lainnya? (y/n): ");
                next = sc.nextLine();

                if(next.equalsIgnoreCase("n")) {
                break;
                }
            } 
            break;

            case 2:
                System.out.println("===Daftar penonton===");
                for (int i = 0; i < penonton.length; i++) {
                    System.out.print("baris ke-" + (i+1) + ": ");
                    for (int j = 0; j < penonton[i].length; j++) {
                        String isiKursi = (penonton[i][j] == null) ? "***" : penonton[i][j];
                        System.out.printf("%-15s",isiKursi);
                    }
                    System.out.println();
                }
                break;

            case 3:
                System.out.println("Terima Kasih.");
                sc.close();
                return;

            default:
                System.out.println("Pilihan menu tidak valid, silahkan input nomor 1, 2, atau 3");  
                break;     
        }
    }    
  }
}
