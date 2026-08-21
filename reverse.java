import java.util.*;
public class reverse{
    static int reverse(int num){
        int temp = num;
        int rev = 0;
        while(temp != 0){
            int d = temp%10;
            rev = rev*10 + d;
            temp = temp/10;
        }
        return rev;
    }

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the number to be reversed:");
        int n = sc.nextInt();
        int reversed = reverse(n);
        System.out.println("The reverse of "+ n + " is : "+ reversed);
    }
}