import java.util.*;

public class MakingAnagrams {
    public static int numberNeeded(String first, String second) {
        if(first.length()<0 || first.length()>10000 ||
                second.length()<0 || second.length()>10000) {
            return first.length() + second.length();
        }

    StringBuffer firstWord=new StringBuffer(first.toLowerCase());
    StringBuffer secondWord=new StringBuffer(second.toLowerCase());
    int indexOne,indexTwo;

    for (int i=0;i<first.length();i++){
            indexTwo=secondWord.indexOf(first.charAt(i)+"");
            indexOne=firstWord.indexOf(first.charAt(i)+"");
            if(indexTwo>=0){
                firstWord.deleteCharAt(indexOne);
                secondWord.deleteCharAt(indexTwo);
            }
        }

    return firstWord.length()+secondWord.length();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}