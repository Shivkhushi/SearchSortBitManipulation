import java.util.*;

//find the index of square root
public class sqaureroot {
   
    public static int number(int t) {
        int low = 0;
        int high = t;
          int store=0;
        while (low <= high) {
            int mid = (low + high) / 2; 
            int val=mid*mid;
            if (val == t)
            {
               return mid;
        
            } else if (val > t) {
                high = mid - 1;
            } else {
                store=mid;//TO store the floor value if number is not square root
                low = mid + 1;
            }
        }
        return store;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number");
        int t = s.nextInt();
        int result = number(t);
        System.out.println("the index of square root" + result);
    }
}
