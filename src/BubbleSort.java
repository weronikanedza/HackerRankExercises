import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numberOfElements=scanner.nextInt();

        if(numberOfElements<0) {
            System.out.println("Wrong input");
        }else{
        sort(numberOfElements);
        }
    }

    public static void sort(int numberOfElements){
        Scanner scanner=new Scanner(System.in);
        int table[] = new int[numberOfElements];
        int swaps;
        swaps=0;

        for (int i=0;i<numberOfElements;i++){
            table[i]=scanner.nextInt();
        }

         for (int i=0;i<numberOfElements;i++){
             for(int j=0;j<numberOfElements-1;j++){
                  if(table[j]>table[j+1]){
                      swap(j,j+1,table);
                      swaps++;
                  }
             }
         }
        System.out.println("Array is sorted in "+swaps+" swaps.");
        System.out.println("First Element: "+table[0]);
        System.out.println("Last Element: "+table[numberOfElements-1]);

    }

    public static void swap(int a,int b,int table[]){
        int temp;
        temp=table[a];
        table[a]=table[b];
        table[b]=temp;
    }
}
