public class stringSearch {
    public static int linerSearch(String[] item, String key) {
        for (int i = 0; i < item.length; i++) {
            if (item[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] arr = {"dosa", "edili", "samber", "rajma", "biriyani"};
        String key = "dosa";

        int index = linerSearch(arr, key);
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Index at " + index);
        }
    }
}
