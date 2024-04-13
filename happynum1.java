import java.util.Scanner;
public class happynum1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num,sum=0,d;
        System.out.println("Enter a number");
        num = in.nextInt();
        sum=num;
        do{
            num=sum;
            sum=0;
            do{
                d=num%10;
                sum=sum+d*d;
                num=num/10;
            }
        while(num>0);    
        }
    while(num>9);
    if(sum==1)
        System.out.println("Happy Number");
    else
        System.out.println("Not a happy Number");         
    }
}
