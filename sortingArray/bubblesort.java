
import java.util.Arrays;

public class bubblesort {
   public static void main(String[] args) {
    int a[]={1,4,3,6,5,2};
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
