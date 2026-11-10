package tugas1PBD;

//berfungsi untuk memungkinkan seluru code menggunakan kelas-kelas yang berada di dalam paket lain di luar paket utama program restoran.
import java.util.Scanner;

public class tugas1 {

    //--------------------------------------------------
    static class Menu {

        String nama;
        double harga;
        String kategori; // "Makanan" atau "Minuman"

        //konstruktor
        //untuk mendefinisikan data dan cara membuat objek menu baru secara terstruktur dalam program restoran.
        public Menu(String nama, double harga, String kategori) {
            // this nama inisiai atribut
            this.nama = nama;
            this.harga = harga;
            this.kategori = kategori;
        }
    }
    //---------------------------------------------------

    // --- Data Menu Restoran (Array of Object) ---
    static Menu[] daftarMenu = new Menu[]{
        // Makanan (Minimal 4)
        new Menu("Nasi Goreng", 25000.0, "Makanan"),
        new Menu("Sate Ayam", 30000.0, "Makanan"),
        new Menu("Gado-Gado", 20000.0, "Makanan"),
        new Menu("Nasi Padang", 35000.0, "Makanan"),
        // Minuman (Minimal 4)
        new Menu("Es Teh Manis", 5000.0, "Minuman"),
        new Menu("Jus Jeruk", 12000.0, "Minuman"), // Dipilih untuk penawaran B1G1
        new Menu("Kopi Susu", 18000.0, "Minuman"),
        new Menu("Air Mineral", 3000.0, "Minuman")
    };
    //----------------------------------------------------- 

    // --- Metode CARI HARGA (Menggunakan IF-ELSE IF Berantai) ---
    public static double cariHarga(String namaMenu) {
        if (namaMenu.equalsIgnoreCase("Nasi Goreng")) {
            return 25000.0; 
        }else if (namaMenu.equalsIgnoreCase("Sate Ayam")) {
            return 30000.0; 
        }else if (namaMenu.equalsIgnoreCase("Gado-Gado")) {
            return 20000.0; 
        }else if (namaMenu.equalsIgnoreCase("Nasi Padang")) {
            return 35000.0; 
        }else if (namaMenu.equalsIgnoreCase("Es Teh Manis")) {
            return 5000.0; 
        }else if (namaMenu.equalsIgnoreCase("Jus Jeruk")) {
            return 12000.0; 
        }else if (namaMenu.equalsIgnoreCase("Kopi Susu")) {
            return 18000.0; 
        }else if (namaMenu.equalsIgnoreCase("Air Mineral")) {
            return 3000.0;
        }
        return 0.0;
    }
    //------------------------------------------------------------------

    // --- Metode Menampilkan Menu ---------------------------------------
    public static void tampilkanMenu() {
        System.out.println("\n=========================================");
        System.out.println("            DAFTAR MENU RESTORAN            ");
        System.out.println("========================================= ");
        System.out.println("--- MAKANAN ---");
        // Cetak eksplisit tanpa perulangan                                                                        //String format
        if (daftarMenu.length >= 1 && daftarMenu[0].kategori.equals("Makanan")) {
            System.out.printf("%-15s Rp %.0f%n", daftarMenu[0].nama, daftarMenu[0].harga);
        }
        if (daftarMenu.length >= 2 && daftarMenu[1].kategori.equals("Makanan")) {
            System.out.printf("%-15s Rp %.0f%n", daftarMenu[1].nama, daftarMenu[1].harga);
        }
        if (daftarMenu.length >= 3 && daftarMenu[2].kategori.equals("Makanan")) {
            System.out.printf("%-15s Rp %.0f%n", daftarMenu[2].nama, daftarMenu[2].harga);
        }
        if (daftarMenu.length >= 4 && daftarMenu[3].kategori.equals("Makanan")) {
            System.out.printf("%-15s Rp %.0f%n", daftarMenu[3].nama, daftarMenu[3].harga);
        }

        System.out.println("\n--- MINUMAN ---");
        if (daftarMenu.length >= 5 && daftarMenu[4].kategori.equals("Minuman")) {
            System.out.printf("%-15s Rp %.0f%n", daftarMenu[4].nama, daftarMenu[4].harga);
        }
        if (daftarMenu.length >= 6 && daftarMenu[5].kategori.equals("Minuman")) {
            System.out.printf("%-15s Rp %.0f%n", daftarMenu[5].nama, daftarMenu[5].harga);
        }
        if (daftarMenu.length >= 7 && daftarMenu[6].kategori.equals("Minuman")) {
            System.out.printf("%-15s Rp %.0f%n", daftarMenu[6].nama, daftarMenu[6].harga);
        }
        if (daftarMenu.length >= 8 && daftarMenu[7].kategori.equals("Minuman")) {
            System.out.printf("%-15s Rp %.0f%n", daftarMenu[7].nama, daftarMenu[7].harga);
        }
        System.out.println("=========================================");
    }
    //--------------------------------------------------------------------------

    // --- MAIN PROGRAM Utama (Hanya satu) ----------------------------------------------
    public static void main(String[] args) {
        //Baris ini membuat sebuah objek Scanner baru dan menugaskannya ke variabel bernama input.
        //inisiasi input
        Scanner input = new Scanner(System.in);
        tampilkanMenu();

        // Variabel untuk menampung 4 item (maksimal 4)
        String nama1 = "", nama2 = "", nama3 = "", nama4 = "";
        int jumlah1 = 0, jumlah2 = 0, jumlah3 = 0, jumlah4 = 0;

        // *** 1. INPUT PEMESANAN (Maksimal 4 item) ***
        System.out.println("\n--- MASUKKAN PESANAN (Maksimal 4 Menu) ---");

        // Logika input menggunakan IF untuk membatasi
        // menampilkan promt ke consol
        System.out.print("Menu ke-1 (Nama): ");
        // Membaca seluruh baris teks yang dimasukkan pengguna (nama menu) dan menyimpannya ke dalam variabel nama1.
        nama1 = input.nextLine();

        //kondisi pemeriksaan
        // ke1
        if (!nama1.isEmpty()) {
            System.out.print("Menu ke-1 (Jumlah): ");
            // Error handling dasar jika pengguna memasukkan non-angka
            if (input.hasNextInt()) {
                jumlah1 = input.nextInt();
            }
            input.nextLine();
        }
        // ke2
        if (!nama1.isEmpty() && jumlah1 > 0) { // Hanya tanyakan item 2 jika item 1 valid
            System.out.print("Menu ke-2 (Nama): ");
            nama2 = input.nextLine();
            if (!nama2.isEmpty()) {
                System.out.print("Menu ke-2 (Jumlah): ");
                if (input.hasNextInt()) {
                    jumlah2 = input.nextInt();
                }
                input.nextLine();
            }
        }
        //ke 3
        if (!nama2.isEmpty() && jumlah2 > 0) { // Hanya tanyakan item 3 jika item 2 valid
            System.out.print("Menu ke-3 (Nama): ");
            nama3 = input.nextLine();
            if (!nama3.isEmpty()) {
                System.out.print("Menu ke-3 (Jumlah): ");
                if (input.hasNextInt()) {
                    jumlah3 = input.nextInt();
                }
                input.nextLine();
            }
        }
        //ke 4
        if (!nama3.isEmpty() && jumlah3 > 0) { // Hanya tanyakan item 4 jika item 3 valid
            System.out.print("Menu ke-4 (Nama): ");
            nama4 = input.nextLine();
            if (!nama4.isEmpty()) {
                System.out.print("Menu ke-4 (Jumlah): ");
                if (input.hasNextInt()) {
                    jumlah4 = input.nextInt();
                }
                input.nextLine();
            }
        }

        System.out.println("--- PESANAN SELESAI ---\n");
        //----------------------------------------------------------

        // *** 2. PERHITUNGAN ***
        // Harga per item
        // mengeksekusi method dan menyimpan nilai kembaliannya dalam variable
        double hargaSatuan1 = cariHarga(nama1);
        double hargaSatuan2 = cariHarga(nama2);
        double hargaSatuan3 = cariHarga(nama3);
        double hargaSatuan4 = cariHarga(nama4);

        // Total per item
        double total1 = hargaSatuan1 * jumlah1;
        double total2 = hargaSatuan2 * jumlah2;
        double total3 = hargaSatuan3 * jumlah3;
        double total4 = hargaSatuan4 * jumlah4;
        //fungsi untuk total biaya keseluruhan pesanan
        double subtotal = total1 + total2 + total3 + total4;

        // --- PERHITUNGAN DISKON & PENAWARAN (Menggunakan Operator Ternary: Non-IF Eksplisit) ---
        // Diskon 10% jika subtotal > 100.000
        // dicek apakah total nya lebih dari 100000
        double faktorDiskon = (subtotal > 100000) ? 1.0 : 0.0;
        //0.10 = 10%
        double diskon = (subtotal * 0.10) * faktorDiskon;

        // Penawaran Beli satu gratis satu dengan sarat lebih dari 50000 (Jus Jeruk)
        double hargaB1G1 = cariHarga("Jus Jeruk");
        double penawaran = 0.0;
        double faktorPenawaranSubtotal = (subtotal > 50000) ? 1.0 : 0.0;

        // Identifikasi item Jus Jeruk dengan IF/ELSE IF (Diperlukan untuk cek item mana yang dapat B1G1)
        if (nama1.equalsIgnoreCase("Jus Jeruk") && jumlah1 > 1) {
            penawaran = hargaB1G1 * faktorPenawaranSubtotal;
        } else if (nama2.equalsIgnoreCase("Jus Jeruk") && jumlah2 > 1) {
            penawaran = hargaB1G1 * faktorPenawaranSubtotal;
        } else if (nama3.equalsIgnoreCase("Jus Jeruk") && jumlah3 > 1) {
            penawaran = hargaB1G1 * faktorPenawaranSubtotal;
        } else if (nama4.equalsIgnoreCase("Jus Jeruk") && jumlah4 > 1) {
            penawaran = hargaB1G1 * faktorPenawaranSubtotal;
        }

        // Total diskon subtotal makanan dan minuman dan apakah dapat penawaran!!
        double totalSetelahDiskon = subtotal - diskon - penawaran;

        // Pajak dan Biaya Pelayanan
        double pajak = totalSetelahDiskon * 0.10;
        double biayaPelayanan = 20000.0;

        // Total keseluruhan pemesanan.
        double totalAkhir = totalSetelahDiskon + pajak + biayaPelayanan;

        // *** 3. MENCETAK STRUK PESANAN ***
        System.out.println("=========================================");
        System.out.println("            STRUK PEMBAYARAN");
        System.out.println("=========================================");

        // Cetak Item (Menggunakan IF untuk mencetak hanya jika dipesan)
        if (jumlah1 > 0) {
            System.out.printf("%-15s %dx @ %.0f = %.0f", nama1, jumlah1, hargaSatuan1, total1);
            if (nama1.equalsIgnoreCase("Jus Jeruk") && penawaran > 0) {
                System.out.print(" (B1G1)");
            }
            System.out.println();
        }
        if (jumlah2 > 0) {
            System.out.printf("%-15s %dx @ %.0f = %.0f", nama2, jumlah2, hargaSatuan2, total2);
            if (nama2.equalsIgnoreCase("Jus Jeruk") && penawaran > 0) {
                System.out.print(" (B1G1)");
            }
            System.out.println();
        }
        if (jumlah3 > 0) {
            System.out.printf("%-15s %dx @ %.0f = %.0f", nama3, jumlah3, hargaSatuan3, total3);
            if (nama3.equalsIgnoreCase("Jus Jeruk") && penawaran > 0) {
                System.out.print(" (B1G1)");
            }
            System.out.println();
        }
        if (jumlah4 > 0) {
            System.out.printf("%-15s %dx @ %.0f = %.0f", nama4, jumlah4, hargaSatuan4, total4);
            if (nama4.equalsIgnoreCase("Jus Jeruk") && penawaran > 0) {
                System.out.print(" (B1G1)");
            }
            System.out.println();
        }

        System.out.println("-----------------------------------------");
        System.out.printf("Subtotal                     : %.0f%n", subtotal);

        // Cetak Diskon (Hanya jika Diskon > 0)
        if (diskon > 0) {
            System.out.printf("Diskon (10%% > 100rb)        : -%.0f%n", diskon);
        }

        // Cetak Penawaran (Hanya jika Penawaran > 0)
        if (penawaran > 0) {
            System.out.printf("Penawaran B1G1               : -%.0f%n", penawaran);
        }

        System.out.printf("Total Setelah Diskon         : %.0f%n", totalSetelahDiskon);
        System.out.printf("Pajak (10%%)                  : %.0f%n", pajak);
        System.out.printf("Biaya Pelayanan              : %.0f%n", biayaPelayanan);
        System.out.println("-----------------------------------------");
        System.out.printf("TOTAL AKHIR DIBAYAR          : %.0f%n", totalAkhir);
        System.out.println("=========================================");

        input.close();
    }
}
