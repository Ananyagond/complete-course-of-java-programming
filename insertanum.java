import java.util.*;
public class insertanum {
    public static void main(String[] args) {
        int i,n,ele,pos;
        int arr[]=new int[50];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of array elements");
        n=in.nextInt();
        System.out.println("Enter array elements");
        for(i=0;i<n;i++)
             arr[i]=in.nextInt();
        System.out.println("Enter elements to be instead");
        ele=in.nextInt();
        System.out.println("Enter position of insertion");
        pos=in.nextInt();
        for(i=n-1;i>=pos;i--)
               arr[i+1]=arr[i];
        arr[pos]=ele;
        n++;
        System.out.println("Array elements after insertion");
        for(i=0;i<n;i++)
            System.out.println(arr[i]);            
    }
}
