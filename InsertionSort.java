import java.util.Random;

/**
 *
 * @author luisvelazquez
 */
public class InsertionSort
{
   /* declared out side of any method with the static key word so rand could be
    used anywhere within the class. 
    */
   static Random rand = new Random();
    
   public static void main (String [] args)
   {
      
      int [] arr = {5, 2, 4, 6, 1, 3};
      // creates a random int from: 0 (inclusive) to 1001 (exclusive)
      int n = rand.nextInt(1001);
      int [] varryingArray = new int [n];
     
      insertionSort(arr);
      System.out.println("");
      randomizeArray(varryingArray);
      
      
   }
   
   public static void insertionSort(int [] a)
   {
      int j = 0;
      int i  = 0;
      int testVal = 0;
      
      for(i = 1; i < a.length; i++)
         {
            testVal = a[i];
            j = i - 1;
            
            while(j >= 0 && a[j] > testVal)
            {
               a[j + 1] = a[j];
               a[j] = testVal;
               j -= 1;
            }
         }
         
       print(a);
   }
   
   public static void print (int [] b)
   {
       
      
      for(int i = 0; i < b.length; i++)
          System.out.print(b[i] + " ");
         
         
   
   }
   
   public static void randomizeArray (int [] array)
   {
      int num = 0;
      
      for(int i  = 0; i < array.length; i++)
         {
           num = rand.nextInt(1001);;
           array[i] = num; 
         }
      
      insertionSort(array);
   }
   

}
