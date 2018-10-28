/*
 * Now refactor your design so that it is a Double Linked List as the class 
 * above indicates. Make a branch in your repository and call it doubleLinkedList.
 * Switch to this branch and develop the Double Linked List code there. 
 * Now you can switch functionality by switching branches. 
 * 
 * Shafiq Zainuddin - 200342741
 */

public class DoubleLinkedList{
	
	//Declaring variables
	public ListElement head;
	
	/* public ListElement tail;
	 * public int sizeIndex;
	 */
	
	
	//Default constructor
	public DoubleLinkedList()
	{
		/*
   	  	* Initializing variables;
   	  	* 
   	  	* Initialize sizeIndex to 0
   	  	* Initialize head to NULL
   	  	* Initialize tail to NULL
   	  	* 
   	  	* sizeIndex = 0;
   	  	* tail = null;
   	  	*/
		
		head = null;
	}
	
	//Add a node public void addElement(ListElement le)
		public void addElement(ListElement le) 
		{
			ListElement temp = new ListElement();
			temp.setNext(head);
			 
			if(head != null)
			{
				head.setPrevious(temp);
			}
			
			head = temp;

			/* 	if(tail == null)
			 * 	{
			 * 		tail = temp;
			 * 	}
			 * 
			 * 	sizeIndex++;
			 */		
		}

		//Retrieve a node public ListElement getElement(int index)
		public ListElement getElement(int index)
		{
			if (index < 0 || head == null)
			{
				System.out.println("\nError!");
			}
			
	        else
	        {
	        	ListElement node = head;         

	            for(int i = 1; i < index; i++)
	            {	
	            	node = node.getNext();
	            }	            
	            return node;
	        }
			return null;
		}   

		//Delete a node public ListElement deleteElement(int index)
	    public ListElement deleteElement(int index)
	    {
	    	if (index < 0 || index >= sizeIndex)
	    	{	
	    		System.out.println("\nError!");
	    	}
	    	
	        else
	        {  
	            if(index == 0)
	            {
	                ListElement curr = head;
	                head = head.getNext();

	                if(head != null)
	                {
	                	head.setPrevious(null);
	                }
	                
	                sizeIndex--;
	                
	                return curr;
	            }

	            ListElement node = head;

	            for(int i = 1; i < index; i++)
	            {
	            	node = node.getNext();
	            }
	           
	            ListElement curr = node.getNext();

	            node.setNext(node.getNext().getNext());

	            if(node.getNext() != null)
	            {
	            	node.getNext().setPrevious(node);
	            }
	            
	            sizeIndex--;
	            
	            return curr;
	        }
			return head;
	    }

	    //Print the linked list from the head public void printLinkedListHead()
	    public void printLinkedListHead()
	    {
	    	ListElement node = head;

	    	while(node != null)
	    	{
	    		System.out.print(node.getData() + " ");
	    		node = node.getNext();
	    	}

	    	System.out.println();
	    }

	    //Print the linked list from the tail public void printLinkedListTail()
	    public void printLinkedListTail()
	    {
	    	ListElement node = tail;

	    	while(node != null)
	    	{
	    		System.out.print(node.getData() + " ");
	    		node = node.getPrevious();
	    	}

	    	System.out.println();
	    }
	    
	    //Main
	    public static void main(String[] args)
	    {	
	    	DoubleLinkedList ob = new DoubleLinkedList();
	    	
	    	
	    	
	    }
}




