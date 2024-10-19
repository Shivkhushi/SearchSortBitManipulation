import java.util.*;

public class notfound {
   
   
    public static void elementFound(int a[],int length,int t)
    {
      boolean found=false;
      for(int i=0;i<length;i++)
      {
        if(a[i]==t)
        {
            System.out.println("element are found" +i);
            found=true;
            break;
        }
       
      }
      if(!found)
      {
        System.out.println("element not found");
      }
     
    }
  
    public static void main3(String[] args) {
        System.out.println("enter the size of array");
        Scanner s=new Scanner(System.in);
          int length=s.nextInt();
          System.out.println("enter the array elements");
          int a[]=new int[length];
          for(int i=0;i<length;i++)
          {
            a[i]=s.nextInt();
          }
          System.out.println("enter the target");
          int t=s.nextInt();
          elementFound(a,length,t);
    }
}
