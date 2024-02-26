package String;

public class Reverse {
    public static String revString(String s){
        String words[]= s.trim().split(" ");
        StringBuilder sb= new StringBuilder();

        for(int i= words.length-1;i>=0; i-- ){
            if(words[i].length()>0){
                sb.append(words[i]);
                sb.append(" ");
            }
        }
        return sb.substring(0, sb.length()-1).toString();
    }

   

    public static void main(String[] args) {
        String words= "This is a bat";
        System.out.println(revString(words));
    }
}

