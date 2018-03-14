import java.util.Scanner;

public class LeftRotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfElements = in.nextInt();
        int rotationElement = in.nextInt();
        int arrayToRotate[] = new int[numberOfElements];

        for(int i=0; i < numberOfElements; i++) {
            arrayToRotate[i] = in.nextInt();
        }

        rotate(numberOfElements,rotationElement,arrayToRotate);
    }

    public static void rotate(int numberOfElements,int rotationElement,int array[]){
        if(numberOfElements>Math.pow(10,5) || numberOfElements<1){
            System.out.println("Wrong numberOfElements");
        }
        else if(rotationElement<0 || rotationElement>numberOfElements){
            System.out.println("Wrong rotationElement");
        }
        else if(numberOfElements>Math.pow(10,6) || numberOfElements<1){
            System.out.println("Wrong length of array");
        }

        for(int i=0;i<numberOfElements-rotationElement;i++){
            for(int j=rotationElement+i;j>i;j--){
                int temp=array[j];
                array[j]=array[j-1];
                array[j-1]=temp;
            }
        }

        for (int i=0;i<numberOfElements;i++)
            System.out.print(array[i]+" ");

    }

}
