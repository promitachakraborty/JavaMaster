    public class bubblesorting {  
     public static void printArray(int[] arr) {  
        
         for(int i=0; i<arr.length-1; i++){  
                 for(int j=1; j<arr.length-i-1; j++){  
                          if(arr[j-1] > arr[j]){  

                                 //swap elements  
                                int temp = arr[j];  
                                 arr[j] = arr[j-1];  
                                 arr[j-1] = temp;  
                         }  
                          
                 }  
         }  
  
    }  
    public static void main(String[] args) {  
                int arr[] ={3,60,350,20,45,320,5};  
                 
                System.out.println("Array Before Sorting");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                System.out.println();  
                  printArray(arr);
                
                System.out.println("Array After Sorting");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
   
        }  
}  