public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "akhila";
        String res = "akhil";
        boolean exist = false;

        for(int i=0; i<=s.length()-1; i++) {
            for(int j=0; j<res.length(); j++) {
                if(s.charAt(i) == res.charAt(j)) {
                    exist = true;
                    break;
                }
                res += s.charAt(i);
            }
        }
    }
}