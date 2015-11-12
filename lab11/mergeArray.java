//Charles Inwald
//Lab 11 - Sorting and Merging Arrays
//11/5/2015
import java.util.Scanner; //import Scanner
public class mergeArray {   //Create Class
   public static void main(String args[]) { //Creates main method
       int[] array1 = new int [20]; //creates first array
       for (int i=0; i<array1.length; i++) { //loops through first array
           array1[i] = (int)(Math.random()*100); //assigns random values
       }
       int[] array2 = new int [10]; //creates second array
       for (int i=0; i<array2.length; i++) { //loops through
           array2[i] = (int)(Math.random()*100); //assigns random
       }
       sort(array1); //sorts first
       sort(array2); //sorts second
       int array3[] = new int[30]; //creates third
      for (int i =0; i <20;i++) { //loops through first 20 cells
    	  array3[i] = array1[i]; //places first array elements
      }
      for (int i=0; i<10;i++) { //loops 10 times
    	  int k = i+20; //goes through last 10 items
    	  array3[k] = array2[i]; //places second array items
      }
      for (int i = 0; i < array3.length - 1; i++) //loops through third array
      {
          int x = i; //positions
          for (int j = i + 1; j < array3.length; j++) //sorts
              if (array3[j] < array3[x]){ //sorts
                  x = j; //assigns
              }
          int small = array3[x]; 
          array3[x] = array3[i];
          array3[i] = small;
      }
      for (int i=0;i<30;i++) { //loops through third array
          System.out.println(array3[i]); //prints
      }
   }
       public static void sort(int[] array){
         
        for (int i = 0; i < array.length - 1; i++) //loops through array - 1
        {
            int x = i; //sets x = i
            for (int j = i + 1; j < array.length; j++) //looops through array + 1
                if (array[j] < array[x]){ //sees if j is lower
                    x = j; //sets x = j
                }
            int small = array[x]; 
            array[x] = array[i];
            array[i] = small;
        }
    
      
       }
   }   

    
