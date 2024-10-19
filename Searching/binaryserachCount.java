

//count the total number of occurence of target

public class binaryserachCount {

    // count how many number of 2 help of binary search
    public static int findfirst(int a[], int low, int high, int t) {
        int index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == t) {
                index = mid;
                high = mid - 1;
            } else if (a[mid] > t) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return index;
    }

    // count how many number of 2 help of binary search
    public static int findlast(int a[], int low, int high, int t) {
        int index = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == t) {
                index = mid;
                low = mid + 1;
            } else if (a[mid] > t) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int a[] = { 0, 0, 1, 2,  3, 3 };
        int low = 0;
        int t = 2;
        int high = a.length - 1;
    
        int first = findfirst(a, low, high, t);
        int last = findlast(a, low, high, t);
        if(first==-1)
        {
            System.out.println(0);
        }
        else
        {
            System.out.println(last - first + 1);
        }
      
    }
}