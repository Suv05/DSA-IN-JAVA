public class isOdd {
    public static void checkOdd(int n){
        if((n&1)==0){
            System.out.println("Even number");
        }else {
            System.out.println("odd number");
        }
    }
    public static void main(String[] args) {
        checkOdd(4);
        checkOdd(3);
        checkOdd(10);
    }
}
