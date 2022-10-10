import java.util.Scanner;

public class RunMain {
        static int reverseDigits(int n)
        {
            int rev_n = 0;
            while (n > 0) {
                rev_n = rev_n * 10 + n % 10;
                n = n / 10;
            }
            return rev_n;
        }

        public static void main(String[] args)
        {
            int n;
            Scanner sc = new Scanner(System.in);
            System.out.println("Input n: ");
            n = sc.nextInt();
            System.out.printf("Reverse of %d is %d" ,n,reverseDigits(n));

        }
}
