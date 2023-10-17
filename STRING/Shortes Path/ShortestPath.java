public class ShortestPath {

    public static Float getShortestPath(String path) {
        float x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            String dir = String.valueOf(path.charAt(i));

            switch (dir) {
                case "N" -> y++;
                case "S" -> y--;
                case "E" -> x++;
                case "W" -> x--;
            }
        }

        float x2 = x * x;
        float y2 = y * y;

        return (float) Math.sqrt(x2 + y2);
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}
