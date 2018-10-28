import java.util.Scanner;

/*
 * Now create an object of this class and access the members: 
 * ListElement le = new ListElement();
 * le.setData(5);
 * 
 * Your assignment is to write a Linked List Program that has the 
 * following requirements.
 * 
 * Runs a program which allows the user to:
 * • Add a node public void addElement(ListElement le)
 * • Retrieve a node public ListElement getElement(int index)
 * • Delete a node public ListElement deleteElement(int index)
 * • Print the linked list from the tail public void printLinkedListTail()
 * • Print the linked list from the head public void printLinkedListHead()
 * 
 * Shafiq Zainuddin - 200342741
 */

public class LinkedList {
	
	//Declaring variables
	public ListElement head;
	public ListElement tail;
	public int sizeIndex;
	
	//Default constructor
	public LinkedList( )
	{
		/*
   	  	* Initializing variables;
   	  	* 
   	  	* Initialize sizeIndex to 0
   	  	* Initialize head to NULL
   	  	* Initialize tail to NULL
   	  	*/
		sizeIndex = 0;
		head = null;
		tail = null;
	}
		
	//Add a node public void addElement(ListElement le)
	public void addElement(ListElement le) 
	{
		ListElement temp = new ListElement();
		temp.setNext(head);
		 
		if(head != null)
		{
			tail.setPrevious(temp);
		}
		
		head = temp;

		if(tail == null)
		{
			tail = temp;
		}
		
       sizeIndex++;
    }

	//Retrieve a node public ListElement getElement(int index)
	public ListElement getElement(int index)
	{
		if (index < 0 || index >= sizeIndex)
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
		return head;
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
    	LinkedList ob = new LinkedList();
    	
    	ListElement le1 = new ListElement(); 
    	ListElement le2 = new ListElement();
    	ListElement le3 = new ListElement();
    	ListElement le4 = new ListElement();
    	ListElement le5 = new ListElement();
		    	
    	System.out.print("Welcome to Linked List: :D \n");
    	
    	System.out.print("Please put in 5 numbers in: \n");
    	
    	/* Asking for the user input;
    	 * Should be an error if the input is not an integer
    	 * 
    	 * Reference: https://stackoverflow.com/questions/2506077/how-to-read-
    	 * integer-value-from-the-standard-input-in-java
    	 */
    	
    	         
    }
}

	

	
	
	


