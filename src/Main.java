import java.util.Scanner;

public class Main {

    static public int[] InputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int arr[] = InputArray();
        bs.bubbleSort(arr);
        bs.printArray(arr);
        int arr1[] = InputArray();
        InsertionSort is = new InsertionSort();
        is.sort(arr1);
        is.printArray(arr1);

        SelectionSort ss = new SelectionSort();
        int arr2[] = InputArray();
        ss.sort(arr2);
        ss.printArray(arr2);


    }
}