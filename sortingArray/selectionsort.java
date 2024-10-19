
import java.util.Arrays;
//code of slection sort that is much more smarter than bubble sort because it updates index instead of swapping
public class selectionsort {
    public static void main(String[] args) {
        int a[] = { 3,5,1,6,0 };
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] > a[min]) {
                    min = j;
                }
            }
            if (min != i)

            {
                int temp = a[min];
                a[min] = a[i];
                a[i] = temp;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
// Original Array is {3 5 1 6 0}
// In first iteration array is {6 5 1 3 0}
// In second iteration array is {6 5 1 3 0}
// In third iteration array is {6 5 3 1 0}
// Now the array is sorted.
