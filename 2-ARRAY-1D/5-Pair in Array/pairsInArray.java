public class pairsInArray {
    public static void pairs(int[] num) {
        int tp=0;
        for (int i = 0; i < num.length; i++) {
            int current = num[i]; //2 4 6 8 10
            for (int j = i + 1; j < num.length; j++) {
                System.out.print("( "+current+","+num[j]+" )");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total numbers of pair "+tp);
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10};
        pairs(array);
    }
}
//time complexity=O(n squre)