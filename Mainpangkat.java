import java.util.Scanner;
public class Mainpangkat {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = input.nextInt();
        
        //array of object
        Pangkat[] png = new Pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai baris elemen ke-" + (i+1) + ": ");
            int basis = input.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-" + (i+1) + ": ");
            int pangkat = input.nextInt();
            png[i] = new Pangkat(basis, pangkat);
        }


        //hasil pangkat
        System.out.println("HASIL PANGKAT BRUTEFORCE");
        for (Pangkat p : png) {
           System.out.println(p.pangkatBF());
        }
        System.out.println("HASIL PANGKAT DIVIDE CONQUER");
        for (Pangkat p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + " = " + p.pangkatDC(p.nilai, p.pangkat));
        }

    }
}
