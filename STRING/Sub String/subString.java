public class subString {
    public static String findSubString(String str, int start, int end) {
        String subStr = "";
        for (int j = start; j < end; j++) {
            subStr += str.charAt(j);
        }
        return subStr;
    }

    public static void main(String[] args) {
        String i = "HelloWorld";
        //System.out.println(findSubString(i, 1, 3));

        //java inbuilt function
        System.out.println(i.substring(1,3));
    }
}
