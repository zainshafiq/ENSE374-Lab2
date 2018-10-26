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
			System.out.println("Error!");
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
    		System.out.println("Error!");
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
		return null;
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
    	ListElement le1 = new ListElement(); 
		ListElement le2 = new ListElement();
		ListElement le3 = new ListElement();
		ListElement le4 = new ListElement();
		ListElement le5 = new ListElement();
		
		
		le1.setData(1); 
		le2.setData(2);
		le3.setData(3);
		le4.setData(4);
		le5.setData(5);
    	    	
		LinkedList ob = new LinkedList();
    	        
    	ob.addElement(le1);
    	ob.addElement(le2);
    	ob.addElement(le3);
    	ob.addElement(le4);
    	ob.addElement(le5);

    	//Test print List
        System.out.print("\nList Forward : ");

        ob.printLinkedListHead();      

        //Test print List
        System.out.print("\nList Backward : ");

        ob.printLinkedListTail();

        //Test Deleting
        ob.deleteElement(1);

        System.out.print("\nDeleted 1: ");
        ob.printLinkedListHead();
        
        ob.deleteElement(3);

        System.out.print("\nDeleted 3: ");
        ob.printLinkedListHead();
        
        ob.deleteElement(5);
        
        System.out.print("\nDeleted 5: ");
        ob.printLinkedListHead();              
    }
}

	

	
	
	


