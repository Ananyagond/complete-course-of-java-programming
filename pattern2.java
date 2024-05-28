public class pattern2 {
    public static void main(String[] args) {
        int i,j,k,p=1;
        for(i=5;i>=1;i--){
            for(k=1;k<=p;k++)
                System.out.print(" ");
            for(j=i;j>=1;j--)
                System.out.print(j);
        System.out.println();
        p=p+1;    
        }
    }
}

