import java.util.Arrays;

public class mergeShort {

    // Metode utama untuk menjalankan Merge Sort (Descending)
    public static void mergeSortDescending(int[] array) {
        if (array.length < 2) {
            return; // Array dengan 0 atau 1 elemen sudah terurut
        }
        
        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);
        
        // Rekursif memecah array
        mergeSortDescending(left);
        mergeSortDescending(right);
        
        // Menggabungkan kembali array yang sudah terurut
        merge(array, left, right);
    }

    // Metode untuk menggabungkan (merge) dua sub-array (Descending)
    private static void merge(int[] result, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        
        while (i < left.length && j < right.length) {
            // Perubahan di sini: left[i] > right[j] untuk urutan Descending
            if (left[i] > right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }
        
        // Menyalin sisa elemen (jika ada)
        while (i < left.length) {
            result[k++] = left[i++];
        }
        while (j < right.length) {
            result[k++] = right[j++];
        }
    }
    
    // Metode utama untuk testing
    public static void main(String[] args) {
        // Data minimal 8 elemen
        int[] data = {95, 20, 78, 12, 55, 30, 88, 41, 15, 62};
        
        System.out.println("Data Awal (Merge Sort): " + Arrays.toString(data));
        
        // Panggil Merge Sort
        mergeSortDescending(data);
        
        System.out.println("Data Setelah Diurutkan (Descending): " + Arrays.toString(data));
    }
}