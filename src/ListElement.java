public class ListElement
{

     private ListElement next;
     private ListElement previous;
     private int data;
     
     public ListElement( )
     {
     this.data = 0;
     this.next = null;
     this.previous = null;
     }
     
     public void setData(int data)
     {
    	 this.data = data;
     }

     public int getData()
     {
         return this.data ;
     }
     
     public ListElement getNext() 
     {
    	 return next;
     }
     
     public void setNext(ListElement next) 
     {
    	 this.next = next;
     }

     public ListElement getPrevious() 
     {
         return previous;
     }     

     public void setPrevious(ListElement previous) 
     {
    	 this.previous = previous;
     }     
}