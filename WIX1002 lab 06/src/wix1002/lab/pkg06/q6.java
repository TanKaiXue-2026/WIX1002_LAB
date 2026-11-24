
package wix1002.lab.pkg06;

public class q6 {
    
    static boolean palindromic(int n) {
        int temp = n;
        for (int i = 2; i < temp; i++) {
            if (temp % i == 0) {
                return false;
            }
        }
        int reverse = 0;
        while (n > 0) {
            int r = n % 10;
            reverse = reverse * 10 + r;
            n = n / 10;
        }
        return reverse == temp;
    }

    static boolean emirp(int n) {
        int temp = n;
        int reverse = 0;
        while (n > 0) {
            int r = n % 10;
            reverse = reverse * 10 + r;
            n = n / 10;
        }
        if (temp == reverse) {
            return false;
        }

        boolean isTempPrime = true;
        for (int i = 2; i < temp; i++) {
            if (temp % i == 0) {
                isTempPrime = false;
                break; 
            }
        }

        boolean isReversePrime = true;
        for (int i = 2; i < reverse; i++) {
            if (reverse % i == 0) {
                isReversePrime = false;
                break;
            }
        }

        return (isTempPrime && isReversePrime);
    }

    public static void main(String[] args) {
        System.out.println("First 20 Palindromic Primes:");
        int i = 2;
        int num = 0;
        while (num < 20) {
            if (palindromic(i)) {
                System.out.print(i + " ");
                num++;
            }
            i++;
        }

        System.out.println("\n");
        System.out.println("First 20 Emirps:");
        i = 2;
        num = 0;
        while (num < 20) {
            if (emirp(i)) {
                System.out.print(i + " ");
                num++;
            }
            i++;
        }
    }
}

