/*
 * The following is a class named ListElement. This class demonstrates the 
 * functionality of a DoublecLinked List. In Phase 1 you will create a single
 * linked list. Remember to check in and Push to your GitHub repository.
 * 
 * Shafiq Zainuddin - 200342741
 */

public class ListElement
{
	/*
	 * Declaring variables
	 */
	
     private ListElement next;
     private ListElement previous;
     private int data;
     
     public ListElement()
     {
    	 /*
    	  * Initializing variables;
    	  * 
    	  * Initialize data to 0
    	  * Initialize next to NULL
    	  * Initialize previous to NULL
    	  */
    	 
    	 this.data = 0;				
    	 this.next = null;			
    	 this.previous = null;		
     }
     
     /*
      * Notice the private members. If a user wants to access these members, 
      * we must give them access via setters and getters.
      * 
      * @param data
      * 	an integer to be stored in the node
      * @return
      * 	None 
      */
     
     //Giving access via setter for data  
     public void setData(int data)
     {
    	 this.data = data;
     }

     //Giving access via getter for data
     public int getData()
     {
         return this.data ;
     }     
     
     //Giving access via setter for next
     public void setNext(ListElement next) 
     {
    	 this.next = next;
     }
     
     //Giving access via getter for next
     public ListElement getNext() 
     {
    	 return this.next;
     }     

     //Giving access via setter for previous
     public void setPrevious(ListElement previous) 
     {
    	 this.previous = previous;
     }
     
     //Giving access via getter for previous
     public ListElement getPrevious() 
     {
         return this.previous;
     }     
}