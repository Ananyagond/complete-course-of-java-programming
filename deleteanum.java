import java.util.*;
public class deleteanum {
    public static void main(String[] args) {
        int i,n,pos;
        int arr[] = new int[50]; 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of array elements:");
        n=in.nextInt();
        System.out.println("Enter array elements");
        for(i=0;i<n;i++)
        arr[i]=in.nextInt();
        System.out.println("Enter position of  elements to be deleted:");
        pos=in.nextInt();
        for(i=pos+1;i<n;i++)
        arr[i-1]=arr[i];
        n--;
        System.out.println("Array elements after insertion");
        for(i=0;i<n;i++)
            System.out.println(arr[i]);            
    }
}
