
import java.util.Arrays;

public class insertionsort {
   public static void main(String[] args) {
    int a[]={6,5,4,3,2,1};
    for(int i=0;i<a.length;i++)
    {
       int j=i;
       while(j>0 &&a[j]>a[j-1])
       {
        int temp=a[j-1];
        a[j-1]=a[j];
        a[j]=temp;
        j--;
       }
    }
    System.out.println(Arrays.toString(a));
   } 
}


