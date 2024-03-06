public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder(" ");

        for (char ch = 'a'; ch <= 'z'; ch++) {
            str.append(ch);
        }
//time complexity is o(26)
        System.out.println(str);
    }
}
