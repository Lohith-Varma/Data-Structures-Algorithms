public class StringMethods {
    public static void main(String[] args) {
        String s = "   Loh   ith   ";
        String s1 = "Lohith";
        String s3=" ";
        String s2 = new String("Lohith");

        System.out.println(s==s1); // false
        System.out.println(s1==s2); // false


        System.out.println(s.equals(s1)); // true
        System.out.println(s.startsWith("Lo")); //true
        System.out.println(s.endsWith("th")); //true
        System.out.println(s.toLowerCase()); //lohith
        System.out.println(s.toUpperCase()); //LOHITH
        System.out.println(s.trim()); //remove starting and ending spaces   
        System.out.println(s.length()); //14
        System.out.println(s1.indexOf("l")); //0
        System.out.println(s1.lastIndexOf("h")); //5
        System.out.println(s1.toString());
        System.out.println(s1.charAt(4)); //i
        System.out.println(s3.isEmpty()); // false
        System.out.println(s3.isBlank()); // true
        // System.out.println(s2.isLetter()); //alpha
        // System.out.println(s2.isDigit()); //digits
        System.out.println(s2.replace("Loh", "var"));
    }
}
