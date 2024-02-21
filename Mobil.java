public class Mobil {
    // State
    String merek;
    String warna;
    boolean status;

    // Constructor
    public Mobil(String merek, String warna, boolean status) {
        this.merek = merek;
        this.warna = warna;
        this.status = status;
    }

    // Behavior
    public void info() {
        System.out.println("Merek Mobil: " + merek);
        System.out.println("Warna Mobil: " + warna);
    }

    public void berjalan() {
        if (!status) {
            System.out.println(merek + " " + warna + " sedang berjalan");
            status = true;
        } else {
            System.out.println(merek + " " + warna + " sudah berjalan");
        }
    }

    public void berhenti() {
        if (status) {
            System.out.println(merek + " " + warna + " sedang berhenti");
            status = false;
        } else {
            System.out.println(merek + " " + warna + " sudah berhenti");
        }
    }
}

