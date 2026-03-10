public class CountDigits {
    public static void main(String[] args) {
        int n = 0;
        System.out.println(n);
        if(n == 0) {
            System.out.println("1");
        }
        else {
            System.out.println((int)Math.log10(n)+1);
        }
    }
}
