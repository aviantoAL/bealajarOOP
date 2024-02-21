import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Variabel untuk menyimpan pilihan pengguna
        int pilihan;

        // Melakukan loop hingga pengguna memilih untuk keluar (pilihan 5)
        do {
			System.out.println("=================");
            System.out.println("KALKULATOR");
            System.out.println("1. Pertambahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Exit");
			System.out.println("=================");

            // Meminta pengguna untuk memasukkan pilihan
            System.out.print("Masukkan pilihan: ");
            pilihan = scanner.nextInt();

            // Memproses pilihan pengguna
            if (pilihan >= 1 && pilihan <= 4) {
                System.out.print("Bilangan 1: ");
                int bilangan1 = scanner.nextInt();
                System.out.print("Bilangan 2: ");
                int bilangan2 = scanner.nextInt();

                // Menggunakan switch untuk memilih operasi yang sesuai
                switch (pilihan) {
                    case 1:
                        System.out.println("Pertambahan = " + pertambahan(bilangan1, bilangan2));
                        break;
                    case 2:
                        System.out.println("Pengurangan = " + pengurangan(bilangan1, bilangan2));
                        break;
                    case 3:
                        System.out.println("Perkalian = " + perkalian(bilangan1, bilangan2));
                        break;
                    case 4:
                        // Menangani pembagian dengan memeriksa agar pembagi tidak nol
                       System.out.println("Pembagian = " + pembagian (bilangan1, bilangan2));
                        break;
                }
            } else if (pilihan != 5) {
                System.out.println("Pilihan tidak valid, silakan pilih nomor 1-5.");
            }

        } while (pilihan != 5);

        // Menampilkan pesan ketika pengguna keluar dari program
        System.out.println("Terima kasih telah menggunakan kalkulator.");

        // Menutup objek Scanner untuk menghindari resource leak
        scanner.close();
    }

    // Metode pertambahan
    private static int pertambahan(int a, int b) {
        return a + b;
    }

    // Metode pengurangan
    private static int pengurangan(int a, int b) {
        return a - b;
    }

    // Metode perkalian
    private static int perkalian(int a, int b) {
        return a * b;
    }

    // Metode pembagian
    private static int pembagian(int a, int b) {
        return a / b;
    }
}
