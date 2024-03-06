public class LarString {
    public static void main(String[] args) {
        String[] foods={"Apple","Mango","Banana"};

        String largest=foods[0];
        for (int i = 0; i < foods.length; i++) {
            if(largest.compareTo( foods[i])<0){
                largest=foods[i];
            }
        }

        System.out.println(largest);
    }
}
