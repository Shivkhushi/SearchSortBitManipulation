public class lastoccurence {
    //last occurence of target
    public static void main(String[] args) {
        int a[]={2,5,5,5,7,7,8,8};
        int low=0;
        int high=a.length-1;
        int t=5;
        int count=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
           if(a[mid]==t) 
           {
            count=mid;
            low=mid+1;
           }
           else if(a[mid]>t)
           {
            high=mid-1;
           }
           else
           {
            low=mid+1;
           }
        }
        System.out.println(count);
        
    }
}

