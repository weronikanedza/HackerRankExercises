import java.util.*;

public class HashTable {
    static void solve(int[] arr, int money) {
        HashMap<Integer,Integer> arrMap=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int secVal=money-arr[i];
            if(secVal>0){
                if(!arrMap.containsKey(secVal))
                     arrMap.put(arr[i],i+1);
                else{
                    System.out.println(arrMap.get(secVal)+" "+(i+1));
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int money = in.nextInt();
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int arr_i = 0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            solve(arr, money);
        }
        in.close();
    }
}
