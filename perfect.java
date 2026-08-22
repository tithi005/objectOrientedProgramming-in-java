import java.util.*;

public class perfect {
    static boolean isPerfect(int num) {
        if (num <= 1) return false;
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) { 
                    sum += num / i;
                }
            }
        }
        return sum == num;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting point: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending point: ");
        int end = sc.nextInt();

        System.out.println("Perfect numbers in the range:");
        for (int i = start; i <= end; i++) {
            if (isPerfect(i)) {
                System.out.println(i);
            }
        }
    }
}
