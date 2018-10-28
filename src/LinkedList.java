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
    	    	 
        Scanner in = new Scanner(System.in);
    	System.out.printf("Enter the 1st Digit:  ");
        int a = in.nextInt(); //
        le1.setData(a);
        ob.addElement(le1);
        
        System.out.printf("Enter the 2nd Digit:  ");
        int b = in.nextInt();
        le2.setData(b);
        ob.addElement(le1);
        
        System.out.printf("Enter the 3rd Digit:  ");
        int c = in.nextInt();
        le3.setData(c);
        ob.addElement(le1);
        
        System.out.printf("Enter the 4th Digit:  ");
        int d = in.nextInt();
        le4.setData(d);
        ob.addElement(le1);
        
        System.out.printf("Enter the 5th Digit:  ");
        int e = in.nextInt();
        le5.setData(e);
        ob.addElement(le1);
        
    	//Test print List
        System.out.print("\nList Forward : ");

        ob.printLinkedListHead();      

        //Test print List
        System.out.print("\nList Backward : ");

        ob.printLinkedListTail();

        //Test Deleting
        System.out.print("\nWhich index would you like to delete : ");
        int x = in.nextInt();
        ob.deleteElement(x);

        System.out.print("\nLinked List after deletion: ");
        ob.printLinkedListHead();
        
        System.out.print("\nWhich index would you like to delete : ");
        int y = in.nextInt();
        ob.deleteElement(y);
        
        System.out.print("\nLinked List after deletion: ");
        ob.printLinkedListHead();
        
        System.out.print("\nWhich index would you like to delete : ");
        int z = in.nextInt();
        ob.deleteElement(z);
        
        System.out.print("\nLinked List after deletion: ");
        ob.printLinkedListHead();     
    	         
    }
}

	

	
	
	


