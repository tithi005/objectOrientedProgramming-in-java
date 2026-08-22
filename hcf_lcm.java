import java.util.*;
public class hcf_lcm{
    static int hcf(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the first number:");
        int a = sc.nextInt();
        System.out.printf("Enter the second number:");
        int b = sc.nextInt();
        int hcfValue = hcf(a, b);
        int lcmValue = (a * b) / hcfValue;
        System.out.println("HCF of " + a + " and " + b + " is: " + hcfValue);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcmValue);
    }
}