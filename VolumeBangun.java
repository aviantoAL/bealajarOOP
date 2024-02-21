import java.util.Scanner;

public class VolumeBangun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pilihan;

        do {
            System.out.println("=================");
            System.out.println("KALKULATOR VOLUME");
            System.out.println("1. Volume Balok");
            System.out.println("2. Volume Bola");
            System.out.println("3. Volume Tabung");
            System.out.println("4. Exit");
            System.out.println("=================");

            System.out.print("Masukkan pilihan: ");
            pilihan = scanner.nextInt();

            if (pilihan >= 1 && pilihan <= 3) {
                System.out.println("=================");
                double hasilVolume = 0.0;

                switch (pilihan) {
                    case 1:
                        System.out.print("Panjang Balok: ");
                        double panjang = scanner.nextDouble();
                        System.out.print("Lebar Balok: ");
                        double lebar = scanner.nextDouble();
                        System.out.print("Tinggi Balok: ");
                        double tinggi = scanner.nextDouble();
                        hasilVolume = hitungVolumeBalok(panjang, lebar, tinggi);
                        break;
                    case 2:
                        System.out.print("Jari-Jari Bola: ");
                        double jariJari = scanner.nextDouble();
                        hasilVolume = hitungVolumeBola(jariJari);
                        break;
                    case 3:
                        System.out.print("Jari-Jari Tabung: ");
                        double jariTabung = scanner.nextDouble();
                        System.out.print("Tinggi Tabung: ");
                        double tinggiTabung = scanner.nextDouble();
                        hasilVolume = hitungVolumeTabung(jariTabung, tinggiTabung);
                        break;
                }

                System.out.println("Volume = " + hasilVolume);
                System.out.println("=================");
            } else if (pilihan != 4) {
                System.out.println("Pilihan tidak valid, silakan pilih nomor 1-4.");
            }

        } while (pilihan != 4);

        System.out.println("Terima kasih.");
        scanner.close();
    }

    private static double hitungVolumeBalok(double panjang, double lebar, double tinggi) {
        return panjang * lebar * tinggi;
    }

    private static double hitungVolumeBola(double jariJari) {
        return (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
    }

    private static double hitungVolumeTabung(double jariTabung, double tinggiTabung) {
        return Math.PI * Math.pow(jariTabung, 2) * tinggiTabung;
    }
}
