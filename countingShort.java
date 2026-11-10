import java.util.Arrays;

public class countingShort {

    // Metode utama untuk menjalankan Counting Sort (Descending)
    public static void countingSortDescending(int[] arr) {
        int n = arr.length;
        if (n == 0) return;

        // 1. Mencari nilai maksimum (K) dalam array
        int max = arr[0];
        for (int x : arr) {
            if (x > max) {
                max = x;
            }
        }
        
        // Array hitungan (berukuran max + 1)
        int[] count = new int[max + 1];
        // Array hasil
        int[] output = new int[n];
        
        // 2. Menghitung kemunculan setiap elemen
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }
        
        // 3. Memodifikasi array hitungan untuk menyimpan posisi awal elemen
        // Untuk Descending, kita hitung frekuensi kumulatif dari K (max) ke 0.
        // Ini menentukan posisi elemen terkecil, sehingga elemen terbesar ditempatkan lebih dulu.
        for (int i = max - 1; i >= 0; i--) {
            count[i] += count[i + 1];
        }
        
        // 4. Membangun array output
        // Iterasi array input dari KANAN ke KIRI untuk menjaga stabilitas (jika ada nilai yang sama)
        // dan penempatan yang benar.
        for (int i = n - 1; i >= 0; i--) {
            int value = arr[i];
            // Posisi saat ini adalah count[value] - 1 karena penempatan Descending
            output[count[value] - 1] = value;
            count[value]--;
        }

        // 5. Menyalin elemen terurut dari output kembali ke array asli
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    // Metode utama untuk testing
    public static void main(String[] args) {
        // Data minimal 8 elemen (nilai harus non-negatif dan dalam rentang yang wajar)
        int[] data = {8, 1, 9, 3, 5, 2, 7, 4, 3, 6};
        
        System.out.println("Data Awal (Counting Sort): " + Arrays.toString(data));
        
        // Panggil Counting Sort
        countingSortDescending(data);
        
        System.out.println("Data Setelah Diurutkan (Descending): " + Arrays.toString(data));
    }
}