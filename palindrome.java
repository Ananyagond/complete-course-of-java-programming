public class palindrome {
    public static void main(String [] args) {
        String word = "";
        String word1 = "";
        char chr;
        int p = word.length();
        for(int i=p-1; i>=0; i--){
            chr = word.charAt(i);
            word1 = word1+chr;
        }
        if(word.equals(word1)){
            System.out.println("Panlindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}
