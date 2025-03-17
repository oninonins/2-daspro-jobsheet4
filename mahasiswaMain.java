public class MahasiswaMain {
    public static void main(String[] args) {
        int[] nilaiUTS = {78, 85, 90, 76, 92, 88, 80, 82}; 
        int[] nilaiUAS = {82, 88, 87, 79, 95, 85, 83, 84};

        // Mencari nilai UTS tertinggi
        int max = Mahasiswa.cariMaxDC(nilaiUTS, 0, nilaiUTS.length - 1);
        System.out.println("Nilai UTS Tertinggi: " + max);

        // Mencari nilai UTS terendah
        int min = Mahasiswa.cariMinDC(nilaiUTS, 0, nilaiUTS.length - 1);
        System.out.println("Nilai UTS Terendah: " + min);

        // Menghitung rata-rata nilai UAS
        double avg = Mahasiswa.hitungRataBruteForce(nilaiUAS);
        System.out.println("Rata-rata Nilai UAS: " + avg);
    }
}
