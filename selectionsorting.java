 import java.util.*;
 public class selectionsorting {

    public static void printArray(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            int smallest = i;
            for(int j=i+1; j<arr.length; j++){

                if(arr[j] < arr[smallest]){

                    smallest = j;


                    //Swap Elements

                    int temp = arr[smallest];
                    arr[smallest] = arr[i];
                    arr[i] = temp;

                }
            }
        }
    }


    public static void main(String[] args){

        int arr[] ={46,87,90,49,78,99};


        System.out.println("Array Before Sorting");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        printArray(arr);

        System.out.println("Array After Sorting");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


       
 }