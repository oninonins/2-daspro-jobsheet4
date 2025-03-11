class Pangkat {

    int nilai, pangkat;

    //konstruktor berparameter
    Pangkat(int n, int p ){
        nilai = n;
        pangkat = p;
    }

    //method brute force
    int pangkatBF(int a, int n){
        int hasil =1;
        for (int i = 1; i <= n; i++) {
            hasil = hasil * a;
        }
        return hasil;
    }

    //method divide conquer
    int pangkatDC(int a, int n){
        if (n==1) {
            return a;
        } else {
           if (n%2==1) {
               return (pangkatDC(a, n/2) * pangkatDC(a, n/2) * a);
           } else {
                return (pangkatDC(a, n/2) * pangkatDC(a, n/2));
            
           }
            
        }
    }
        
}