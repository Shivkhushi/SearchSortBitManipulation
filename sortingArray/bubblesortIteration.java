
import java.util.Arrays;

public class bubblesortIteration {
   public static void main(String[] args) {
    int a[]={3,5,1,6,0};
    for(int i=0;i<a.length;i++)
    {
        boolean swapped=false;
        for(int j=0;j<a.length-i-1;j++)
        {
            if(a[j]<a[j+1]) //sorted in decresing order
            {
                int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
                swapped=true;
            }
        }
        if(!swapped) break;
    }
    System.out.println(Arrays.toString(a));
   } 
}

//Original Array is {3 5 1 6 0}
//In first iteration array is {5 3 6 1 0}
//In second iteration array is {5 6 3 1 0}
//In third iteration array is {6 5 3 1 0}