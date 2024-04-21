package Foundation;

public class RemoveDup {

    public static void main(String[] args) {

        int arr[] = { 1,2 ,2 ,2 , 3 ,3 , 4 };

        int i = 0;
        int count = 0;
        while (i < arr.length - 1) {
            if (arr[i] == arr[i + 1]) {
                i++;
            } else {
                count++;
                i++;
            }
        }
        ;
        count++;

        System.out.println(count);

    }
}