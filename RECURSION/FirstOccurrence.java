public class FirstOccurrence {
    public static int checkOccurence(int[] arr, int key, int index) {
        if (index == arr.length) {
            return -1;
        }if(arr[index]==key){
            return index;
        }
        return checkOccurence(arr,key,index+1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 4, 6, 3};
        int key = 4;
        int index = 0;
        System.out.println(checkOccurence(arr, key, index));
    }
}
