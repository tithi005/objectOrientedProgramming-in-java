import java.util.*;
public class sum_of_digits{
    static int sod(int num){
        int sum = 0;
        int temp = num;
        while(temp != 0){
            int d = temp%10;
            sum += d;
            temp/=10;
        }
        return sum;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the number :");
        int n = sc.nextInt();
        int summation = sod(n);
        System.out.println("The sum of the digits of "+ n + " is : "+ summation);
    }
}