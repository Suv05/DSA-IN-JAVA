public class fibonacciNumber {
    public static int series(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else {
            return series(n-1)+series(n-2);
        }
    }
    public static void main(String[] args) {
        int nthDigit = 10;
        System.out.println(series(nthDigit));
    }
}
