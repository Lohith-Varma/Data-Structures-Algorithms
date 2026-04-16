public class SplitString {
    public static void main(String[] args) {
        String s = "Java is fun";
        String[] words = s.split(" ");

        for(int i=0;i<words.length;i++){
            System.out.println(words[i]);
        }
    }    
}
Arrays.sort(words);