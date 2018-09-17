public class Mergesort
{
   static int [] array = {1000, -1, 70, 40, 90, 100, 300, 250, 700};
   static int size =  array.length;
   public static void main (String [] args)
   {
      mergesort(0, array.length - 1);
      printArray(array);
   
   }
   
   public static void mergesort(int first, int last)
   {
      
      if( first < last) // base case
        {
          int middle = (first + last) / 2;
          mergesort(first, middle); // sorts left side first
          mergesort(middle + 1, last); // sorts right side
          merge(first, middle, middle + 1, last);

         
        }
   
   
   } // ends mergesort method
   
   public static void merge(int leftFirst, int leftLast, int rightFirst, int rightLast)
   {
      int index = leftFirst;
      int saveFirst = leftFirst;
      int [] tempArray = new int [size];
      
      
      // this sorts the arrays concurrently
      while((leftFirst <= leftLast) && (rightFirst <= rightLast))
      {
         
         /*this if-else block compares values on the left and right side array to
         find the lowest value. The lower of the two gets inserted first, then another 
         comparison is made until the while condition is no longer met. */
         
         if(array[leftFirst] < array[rightFirst])
         {
            tempArray[index] = array[leftFirst];
            leftFirst++;
         }
         else
         {
            tempArray[index] =  array[rightFirst];
            rightFirst++;
         }
            
      
         index++;
      } //end initial while
      
      // This is executed if right array is shorter than the left
      while(leftFirst <= leftLast)
      {
         tempArray[index] = array[leftFirst];
         leftFirst++;
         index++;
      
      } // ends second while
      
      // This is executed if left array is short than the left
      while(rightFirst <= rightLast)
      {
         tempArray[index] = array[rightFirst];
         rightFirst++;
         index++;
      
      } // ends third while
      
      /* This for-loop will transfer the values from the temp array over to the
         to the original array. */
       for(index = saveFirst; index <= rightLast; index++)
       {
          array[index] = tempArray[index];
       }
      
   } // ends merge method

   public static void printArray(int [] a)
   {
      for(int i = 0; i < a.length; i++)
         System.out.print(a[i] + " ");
   
   }
}
