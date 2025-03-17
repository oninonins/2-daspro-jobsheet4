public class Mahasiswa {
    int nilaiUTS;
    int nilaiUAS;

    public Mahasiswa(int nilaiUTS, int nilaiUAS) {
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    // Divide and Conquer untuk mencari nilai UTS tertinggi
    public static int cariMaxDC(int[] arr, int l, int r) {
        if (l == r) {
            return arr[l];
        }
        int mid = (l + r) / 2;
        int maxLeft = cariMaxDC(arr, l, mid);
        int maxRight = cariMaxDC(arr, mid + 1, r);
        return Math.max(maxLeft, maxRight);
    }

    // Divide and Conquer untuk mencari nilai UTS terendah
    public static int cariMinDC(int[] arr, int l, int r) {
        if (l == r) {
            return arr[l];
        }
        int mid = (l + r) / 2;
        int lsum = cariMinDC(arr, l, mid);
        int rsum = cariMinDC(arr, mid + 1, r);
        return Math.min(lsum, rsum);
    }

    // Brute Force untuk menghitung rata-rata nilai UAS
    public static double hitungRataBruteForce(int[] arr) {
        int total = 0;
        for (int nilai : arr) {
            total += nilai;
        }
        return (double) total / arr.length;
    }
}
