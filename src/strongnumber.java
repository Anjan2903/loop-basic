import java.util.*;
public class strongnumber {
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("Enter number=");
        int num = s.nextInt();
        int b = 0;
        int sum = 0;
        int temp=num;
        while (num > 0) {
            int f = 1;
            int i = 1;
           int r = num % 10;
            while (i <= r) {
                f = f * i;
                i++;
            }
            sum = sum + f;
            num = num / 10;
            b++;
        }
        System.out.println(sum);
        if(sum==temp) {
            System.out.printf("%d is strong number", sum);
        }
        else {
            System.out.printf("%d is not strong number", sum);
        }
    }
}
