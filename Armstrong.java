
import java.util.*;
public class Armstrong{
    static boolean isArmstrong(int num) {
        int temp = num;
        int count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }
        temp = num;
        int sum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, count);
            temp /= 10;
        }
        return sum == num;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting point: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending point: ");
        int end = sc.nextInt();

        System.out.println("Armstrong numbers in the range:");
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }
}