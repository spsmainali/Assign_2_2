
public class Pyramid {
	   public static void main(String[] args)
	    {
	       	 
	        int noOfRows = 3;
	 
	        //Initializing rowCount with 1
	 
	        int rowCount = 1;
	 
	        System.out.println("Here Is Your Pyramid");
	 
	        //Implementing the logic
	 
	        for (int i = noOfRows; i > 0; i--)
	        {
	            //Printing i*2 spaces at the beginning of each row
	 
	            for (int j = 1; j <= i*2; j++)
	            {
	                System.out.print(" ");
	            }
	 
	            //Printing j value where j value will be from 1 to rowCount
	 
	            for (int j = 1 ; j <= rowCount; j++)             
	            {
	                int q=j+96;
					System.out.print((char)q+" ");
	            }
	 
	            //Printing j value where j value will be from rowCount-1 to 1
	             
	            for (int j = rowCount-1; j >= 1; j--)
	            {                 
	                int q=j+96;
					System.out.print((char)q+" ");             
	            }                          
	            
	            System.out.println();
	 
	            //Incrementing the rowCount 
	 
	            rowCount++;
	        }
			
	    }
	}

