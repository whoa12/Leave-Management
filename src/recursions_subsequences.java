public class recursions_subsequences {
    public static void Subsequences(String str, int idx,  String NewString){
        if(idx == str.length()){
            System.out.println(NewString);
            return;
        }
        char CurrChar = str.charAt(idx);
        // to choose
        Subsequences(str, idx+1, NewString + CurrChar);
        // to not choose
        Subsequences(str, idx+1, NewString);

    }

    public static void main(String[] args) {
        String str = "abc";
        Subsequences(str, 0, "");

    }
}
