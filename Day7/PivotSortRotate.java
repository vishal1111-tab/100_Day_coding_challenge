package Day7;

public class PivotSortRotate {
    public static void main(String args[]) {

        int arr[] = { 50, 10, 20, 30, 40 };

        int lo = 0;
        int hi = arr.length - 1;

        while (lo < hi) {
            int mid = (lo + hi) / 2;  
            if (arr[mid] < arr[hi]) {
                hi = mid;
            } else if (arr[mid] > arr[hi]) {
                lo = mid + 1;
            }
        }

        System.out.println(arr[hi]);
    }
}
