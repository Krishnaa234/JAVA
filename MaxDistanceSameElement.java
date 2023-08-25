//Given an array with repeated elements, the task is to find the maximum distance between two occurrences of an element.
class Solution
{
  int maxDistance(int arr[], int n)
  {
      // Create a HashMap to store the distance between each element and its last occurrence
      
      HashMap﹤Integer, Integer﹥ hm = new HashMap﹤Integer, Integer﹥();
      
  
      
      // Create an ArrayList to keep track of the indices of each element
      
      ArrayList﹤Integer﹥ ar = new ArrayList﹤Integer﹥();
      
      
      
      // Add all elements of the array to the ArrayList
      
      for (int i=0; i﹤n; i++)
      
      {
        
        ar.add(arr[i]);
        
      }
            
      // Calculate the distance between each element and its last occurrence and store it in the HashMap
      
      for(int i =0 ;i﹤n;i++)
      
      {
      
        hm.put(arr[i],(ar.lastIndexOf(arr[i])-ar.indexOf(arr[i])));
      
      }
           
      // Get the size of the HashMap
      
      int size = hm.size();
      
      int max = 0;
      
      // Iterate over the HashMap and find the maximum distance
      
      Iterator﹤Integer﹥ itr = hm.keySet().iterator();
      
      while(itr.hasNext())
      {
      
        Integer key = itr.next();
      
        if(hm.get(key)﹥max)
      
        max = hm.get(key);
      }
      
      return max; 
    }
}
