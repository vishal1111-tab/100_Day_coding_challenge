package Day6;
public class MergeSort {

    public static int [] mergeTwoSort(int arr1[] , int arr2[]){
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

        return res;

    }
    
      

     public static int [] merge(int arr[] , int low , int high){
        if(low==high){
            int bres[] = new int[1];
            bres[0] = arr[low];
            return bres;
        }

        int mid = (low + high) / 2;

       int fst[] =  merge(arr, low, mid);
       int scnd[] = merge(arr, mid+1 , high);
       int res [] = mergeTwoSort(fst , scnd);
        return res;
     }
    public static void main(String[] args) {

        int arr[] = { 5, 9, 8, 2, 1};

       int ans[] =  merge(arr , 0 , arr.length-1);

       for(int x : ans){
           System.out.println(x);
       }
    }
    
}
