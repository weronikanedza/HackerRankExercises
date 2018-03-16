import java.util.*;

public class RansomNote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
        }
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
        }
        comparision(m,n,magazine,ransom);

    }

    public static void comparision(int m,int n,String magazine[],String ransom[]){

        if(m<1 || n<1) System.out.println("Wrong input");

        Hashtable<String,Integer> ht=new Hashtable<>();
       boolean ransomInMagazine=true;

        for (int i=0;i<magazine.length;i++){
            if(ht.containsKey(magazine[i]))
                 ht.put(magazine[i],ht.get(magazine[i])+1);
            else ht.put(magazine[i],1);
        }

        for (int i=0;i<ransom.length;i++){
            if(!ht.containsKey(ransom[i])){
                ransomInMagazine=false;
                break;
            }else{
                if( ht.get(ransom[i])-1==0 ) ht.remove(ransom[i]);
                else ht.put(ransom[i],ht.get(ransom[i])-1);
            }
        }

        if(ransomInMagazine) System.out.println("Yes");
        else System.out.println("No");

    }
}
