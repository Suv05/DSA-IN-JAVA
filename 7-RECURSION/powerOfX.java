public class powerOfX {
//    public static int power(int x, int pow) {
//        if (pow == 0) {
//            return 1;
//        } else if (pow == 1) {
//            return x;
//        } else {
//            return x * power(x, pow - 1);
//        }
//
//    }


    public static int optimizedPower(int x, int pow) {
        if (pow == 0) {
            return 1;
        } else {
            int halfPower = optimizedPower(x, pow / 2);
            int halfPowerSq = halfPower * halfPower;
            //if odd
            if (pow % 2 != 0) {
                halfPowerSq = x * halfPowerSq;
            }

            return halfPowerSq;
        }
    }

    public static void main(String[] args) {
        System.out.println(optimizedPower(5, 4));
    }
}
