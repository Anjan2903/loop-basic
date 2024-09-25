import java.util.*;
public class armstrong {
    public static void main(String[]args){
    Scanner s=new Scanner(System.in);
        System.out.printf("Enter number=");
    int n=s.nextInt();
    int b=0; int a=n; int r=0;int f=1; int sum=0;int c=0;int cnt=0;int t=n;
    while(n>0){
        n=n/10;
        c++;
    }
    cnt=c;
    while(a>0){
        r=a%10;
        while(c>0){
            f=f*r;
            c--;
        }
        sum=sum+f;
        a=a/10;
        f=1;
        c=cnt;
        b++;
    }
        System.out.println(sum);
        if(sum==t) {
            System.out.printf("%d is armstrong number", sum);
        }
        else {
            System.out.printf("%d is not armstrong number", sum);
        }
    }
}
