public class StringReverse {
    public static void main(String[] args) {
        String s = "Hello World";
        String rev = "";
        for(int i=s.length()-1; i>=0; i--) {
            rev += s.charAt(i);
        }
        System.out.println(rev);

        //without using rev
        for(int i=s.length()-1; i>=0; i--) {
            System.out.print(s.charAt(i));
        }
    }    
}
