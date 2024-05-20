package Day6;

public class MergeTwoSortedArray {

    public static void main(String[] args) {
        int arr1[] = { 1, 4, 7, 9 };
        int arr2[] = { 2 , 8 , 76 };

        int res[] = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                res[k] = arr1[i];
                k++;
                i++;
            } else {
                res[k] = arr2[j];
                k++;
                j++;
            }
        }

        while (i < arr1.length) {
            res[k] = arr1[i];
            k++;
            i++;
        }

        while (j < arr2.length) {
            res[k] = arr2[j];
            k++;
            j++;
        }

        for (int x : res) {
            System.out.println(x);
        }

    }

}
