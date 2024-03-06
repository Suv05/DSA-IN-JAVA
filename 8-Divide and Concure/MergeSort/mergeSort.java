public class mergeSort {
    //Divide Part
    public static void MSort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = (si + ei) / 2;//si+(ei-si)/2
        MSort(arr, si, mid);
        MSort(arr, mid + 1, ei);
        Merge(arr, si, mid, ei);

    }

    public static void Merge(int[] arr, int si, int mid, int ei) {

    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 3, 7, 1, 9};
        MSort(arr, 0, arr.length - 1);

    }
}
