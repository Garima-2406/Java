
import java.util.*;


public class ArraysCC {
    
    
    // //output in array//length//input

    // int marks[]= new int[100];

    // //for length
    // System.out.println("length of array = " +marks.length);

    // Scanner sc= new Scanner(System.in);
    // //int phy;
    // // phy =sc.nextInt();

    // marks[0]= sc.nextInt();//Array ka output lene ke liye uper wala normal wala hai
    // marks[1]= sc.nextInt();//chem uper wala phy 
    // marks[2]= sc.nextInt();//math

    // System.out.println("phy :" + marks[0] );
    // System.out.println("chem :" + marks[1] );
    // System.out.println("maths :" + marks[2] );


    // //for update
    // marks[2]= 100;
    // System.out.println("maths:" +marks[2]);

    // //find %

    // int percentage = (marks[0]+ marks[1] + marks[2])/3;
    // System.out.println("percentage: " +percentage +"%");
    


    // // ARRAYS AS FUNCTION ARGUMENTS
    // public static void update(int marks[], int nonChangable){
    //     nonChangable = 10;
    //     for(int i=0; i<marks.length;i++){//v.v imp loop
    //         marks[i] = marks[i] + 1;
    //     }
    // }
    // public static void main(String args[])    {//arrays me values by refrence pass hoti hai
    //     int marks[] = {90, 99, 95};
    //     int nonChangable = 5;
    //     update(marks, nonChangable);
    //     System.out.println(nonChangable);

    //     // print our marrks
    //     for( int i=0;i<marks.length;i++){
    //         System.out.print(marks[i]+" ");
    //     }
    // }
    



    // //LINEAR SEARCH 
    // public static int linearSearch(int numbers[], int key){

    //     for(int i=0;i<numbers.length; i++){
    //         if(numbers[i]==key){
    //             return i;
    //         }
    //     }return -1;
    // }
    // public static void main(String[] args) {
    //     int numbers[]={2,4,6,8,10,12,14,16};
    //     int key =10; 
    //     int index = linearSearch(numbers, key);
    //      if(index == -1){
    //          System.out.print("not found");
    //      }else{
    //           System.out.print("key is at index:" +index);
    //      }




    // //  LARGEST IN ARRAY
    // public static int getlargest(int numbers[]){
    //     int largest  = Integer.MIN_VALUE;//-infinity hai yeh
    //     int smallest = Integer.MAX_VALUE;//+infinity

    //     for(int i=0; i<numbers.length;i++){
    //         if(largest < numbers[i]){
    //             largest = numbers[i];
    //         }
    //         if(smallest > numbers[i]){
    //             smallest = numbers[i];
    //         }
    //     }
    //     // System.out.println("smallest value is:"+ smallest);//2 baar hum return nhi kar sakte iss liye smallest ke liye print kara lenge
    //     return largest;
    // }
    // public static void main(String args[]){
    //     int numbers[] = {1,2,6,3,5};
    //     System.out.println("largest value is :"+ getlargest(numbers));
    // }


    // //REVERSE AN ARRAY
    // public static void reverse(int numbers[]){
    //   int first=0,last=numbers.length-1;
    //   while(first<last){
    //     //swap
    //     int temp = numbers[last];
    //     numbers[last]=numbers[first];
    //     numbers[first]= temp;
    //     first++;
    //     last--;
    //   }
    // }
    // public static void main(String args[]){
    //     int numbers[]={2,4,6,8,10};
    //     reverse (numbers);
    //     //print
    //     for(int i = 0; i < numbers.length; i++) {
    //         System.out.print(numbers[i]+" ");
    //     }
    //     System.out.println();
    // }


    // // PAIRS IN AN ARRAY
    // public static void printpairs(int numbers[]){
    //     int tp=0;
    //     for(int i=0; i<numbers.length; i++){
    //         int current=numbers[i];//2,4,6,8,10
    //         for(int j=i+1;j<numbers.length;j++){
    //             System.out.print("("+ current + ","+ numbers[j]+")");
    //             tp++;
    //         }
    //      System.out.println();
    //     }
    //     System.out.print("total pairs="+tp);
    // }








    
    // public static void main(String args[]){
    //     int numbers[]={2,4,6,8,10};
    //     printpairs(numbers);
    // }



    // SUBARRAY - a continuous part of an array
    public static void printSubarrays(int numbers[]){
        int tp=0;
        for(int i=0;i<numbers.length;i++){
            int start = i;
            for(int j=i ; j<numbers.length;j++){
                int end = j;
                for(int k = start; k<=end; k++){ //print
                    System.out.print(numbers[k]+" "); //subarray
                }
                tp++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrays="+tp);
    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        printSubarrays(numbers);
    }

    }



    
   

