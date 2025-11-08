import java.util.Scanner;

public class AplikasiPengiriman {
    private String namaBarang;
    private double berat; // kg
    private String alamatTujuan;
    private double biaya;

    // Method untuk input data
    public void inputData() {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Aplikasi Pengiriman Barang ===");

        System.out.print("Masukkan nama barang: ");
        namaBarang = input.nextLine();

        System.out.print("Masukkan berat barang (kg): ");
        berat = input.nextDouble();
        input.nextLine(); // clear buffer

        System.out.print("Masukkan alamat tujuan: ");
        alamatTujuan = input.nextLine();
    }

    // Method untuk menghitung biaya
    public void hitungBiaya() {
        biaya = berat * 10000; // Rp10.000 per kg
    }

    // Method untuk menampilkan detail pengiriman
    public void tampilkanDetail() {
        System.out.println("\n=== Detail Pengiriman ===");
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Berat Barang: " + berat + " kg");
        System.out.println("Alamat Tujuan: " + alamatTujuan);
        System.out.println("Biaya Pengiriman: Rp" + biaya);
    }

    public static void main(String[] args) {
        AplikasiPengiriman pengiriman = new AplikasiPengiriman();
        pengiriman.inputData();
        pengiriman.hitungBiaya();
        pengiriman.tampilkanDetail();
    }
}
