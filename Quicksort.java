public class MIT_Quicksort
{
   public static void main (String [] args)
   {
      int [] b = {100, 70, 3, 1, -1, 37, 4, 20, 60};      
      Quicksort(b, 0, b.length -1);
      
      print(b);

   }
   
   public static int [] Quicksort (int [] a, int start, int end)
   {
      
      int partitionIndex = 0;
      
      if(start < end)
      {
         /* The index at partitionIndex will be at appropriate place after
            the Partition method exits */
         partitionIndex = Partition(a, start, end);
         // before the the partition index
         Quicksort(a, start, partitionIndex - 1);
         //after the partition index
         Quicksort(a, partitionIndex + 1, end);
         
      }
      
      return a;
   }
   
   public static int Partition (int [] a, int start, int end)
   {
      /* pivot is initialized to the last value of the array.
         All values < pivot will be to the left, all values >
         than pivot will be to the right. */
      int pivot = a[end];
      
      /* j is initialied to start -1 in case the first element is 
         already in the proper position during this round. For example
         if array = {-1 , 8} it allows -1 to remain in its without needlessly 
         swapping.
         
         The j value will be used as added index that will aide in controlling
         and swapping the values as needed. It will also be incremented accordingly
         and independent of the i's increments in the for-loop. */
      int j = (start - 1);
    
      for(int i = start; i < end ; i++)
         {
            /*this condition allows for the the final result to be in
              ascending order. */
              
            if(a[i] < pivot)
            {
               j++;
               swap(a, j, i);
            }
         
         }
         
         /* This final swap places the pivot in its correct position. Moving the
            end value to where j left off, plus one of course. */
         swap(a, j + 1, end);
         
         return j + 1;
   }
   
   /* just a helper method to make the code above easier to read 
      and reduce code redundancy. */
   public static void swap (int [] a, int j, int i)
   {
      int temp = a[j];
      a[j] = a[i];
      a[i] = temp;
   
   }
   
   
   public static void print(int [] a)
   {
      for(int i = 0; i < a.length; i++)
         {
            System.out.print(a[i] + " ");
         }
   }
}
