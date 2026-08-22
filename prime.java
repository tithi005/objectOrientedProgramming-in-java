import java.util.*;
public class prime{
    static boolean isPrime(int n){
        if(n<=1)
            return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the starting point : ");
        int start = sc.nextInt();
        System.out.printf("Enter the ending point : ");
        int end = sc.nextInt();
        for(int i=start ; i<=end ; i++){
            if(isPrime(i)) System.out.println(i+ " ");
        }
        System.out.println();
    }
}