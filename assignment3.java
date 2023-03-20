
import java.util.*;
class assignment3{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int t,r;
        double sum=0,m;
        t=n;
        while(n>0){
            r=n%10;
            m=Math.pow(r,3);
            sum=sum+m;
            n=n/10;
        }
        if(t==sum){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not armstrong number");
        }
    }
}