public class mahasiswaMain {
    public static void main(String[] args) {
        
        int[] nilaiUTS = {78, 85, 90, 76, 92, 88, 80, 82}; 
        int[] nilaiUAS = {82, 88, 87, 79, 95, 85, 83, 84};

        //mencari nilai tertinggi 
        int max = (int) mahasiswa.cariMaxDC(nilaiUTS, 0, nilaiUTS.length-1);
        System.out.println("Nilai UTS tertinggi: " + max);


        //mencari nilai terendah
        int min = (int) mahasiswa.cariMinDC(nilaiUTS, 0, nilaiUTS.length-1);
        System.out.println("Nilai UTS terendah: " + min);

        //menghitung rata-rata nilai UAS
        double avg = mahasiswa.hitungRataBruteForce(nilaiUAS);
        System.out.println("Rata-rata nilai UAS: " + avg);
        
    }
}
