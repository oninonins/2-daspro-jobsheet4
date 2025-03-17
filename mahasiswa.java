public class mahasiswa {
    int nilaiUTS;
    int nilaiUAS;

    public mahasiswa(int nilaiUTS, int nilaiUAS) {
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    // Divide and Conquer untuk mencari nilai UTS tertinggi
    public static double cariMaxDC(int[] arr, int l, int r) {
        if (l == r) {
            return arr[l];
        }
        int mid = (l + r) / 2;
        double maxLeft = cariMaxDC(arr, l, mid);
        double maxRight = cariMaxDC(arr, mid + 1, r);
        return Math.max(maxLeft, maxRight);
    }
x   
    // Divide and Conquer untuk mencari nilai UTS terendah
    public static double cariMinDC(int[] arr, int l, int r) {
        if (l == r) {
            return arr[l];
        }
        int mid = (l + r) / 2;
        double lsum = cariMinDC(arr, l, mid);
        double rsum = cariMaxDC(arr, mid + 1, r);
        return lsum + rsum;
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
