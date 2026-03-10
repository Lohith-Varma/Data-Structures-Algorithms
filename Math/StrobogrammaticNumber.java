import java.util.*;
class StrobogrammaticNumber {
    static boolean find(int n) {
        int flag;
        int temp = n, rev = 0;
        while(n != 0) {
            int rem = n % 10;
            if(rem == 1 || rem == 8 || rem==0) {
                flag = rem;
            }
            else if(rem == 6) {
                flag = 9;
            }
            else if(rem == 9) {
                flag = 6;
            }
            else return false;
            rev = (rev * 10) + flag;
            n /= 10;
        }
        return temp ==  rev;
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(find(n));
        sc.close();

    }
}