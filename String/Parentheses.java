public class Parentheses {
    public static int missing(String s){
        int open=0;
        int close=0;
        for( char c : s.toCharArray()){
            if(c =='('){
                open++;
            }else if(c==')'){
                if(open>1){
                    open--;
                }else{
                    close++;
                }
            }
        }
        return open+close;
    }

    public static void main(String[] args) {
        String s= "((((()()";
        System.out.println(missing(s));
    }
}
