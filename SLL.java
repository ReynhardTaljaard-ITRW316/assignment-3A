
public class SLL<T extends Comparable<? super T>>
{   
	private Element<T> head;  // list header
	private Element<T> tail;
	
    public SLL()
    {  head = null;  
	   tail = null;        
    }
    public boolean prepend(T newElement) //insert at head
    {  
		Element<T> temp = new Element<T>(newElement);
        if(temp == null) // out of memory
           return false;
        else
        {  
	       if (head==null)
		   {
			head = temp;
			tail = temp;
		   }
           else
           {
			 temp.next = head;
			 head = temp;
		   }
		}
        return true;
    }
	 public boolean append(T newElement) //insert at head
    {  
		Element<T> temp = new Element<T>(newElement);
        if(temp == null) // out of memory
           return false;
        else
        {  
	       if (head==null)
		   {
			head = temp;
			tail = temp;
		   }
           else
           {
			 tail.next = temp;
			 tail = temp;
		   }
		}
     return true;
    }
	
	public boolean deleteHead()
	{
		
		Element<T> ptr = head;
		if(ptr == null)
			return false;
		else
		{
			head = ptr.next;
			return true;
		}
	}
    
   public boolean delete(T item)
   {
	   Element<T> ptr = head;
	   Element<T> prevPtr = null;
	   while (ptr!= null&& ptr.data.compareTo(item)!= 0)
	   {
		   prevPtr=ptr;
		   ptr=ptr.next;
	   }
	   if (ptr == null)//item not found
		   return false;
	   if (ptr==head) // item is first element
		   head= ptr.next;
	   else // general case
		   prevPtr.next=ptr.next;
	   if (ptr==tail)// last element
		   tail=prevPtr;
	   return true;
   }


	public void showAll()
	{
		Element<T> ptr = head;
		while (ptr != null) //continue to traverse the list
		{   
			System.out.printf(ptr.data.toString( )+" ");
			ptr = ptr.next;
		}
	}
   
	public boolean intsertSorted(T item)
	{
		Element<T> ptr = head;// start with second element
		Element<T> prevPtr = null;
		Element<T> newItem;
		boolean inserted = false;
		if (head == null)
		{
			append (item);
			return true;
		}
		if (item.compareTo(head.data)<0)// first element is special case
		{
			prepend(item);
			return true;
		}
		if (item.compareTo(tail.data)>=0)
		{
			append(item);
			return true;
		}
		newItem= new Element<T>(item);
		ptr= head.next;// start with second element
		prevPtr= head;
		while (ptr!= null && !inserted)
		{
			if (newItem.data.compareTo(prevPtr.data)>=0 && newItem.data.compareTo(ptr.data)<=0)
			{
				newItem.next = ptr;
				prevPtr.next = newItem;
				inserted = true;
			}
			prevPtr=ptr;
			ptr= ptr.next;
		}
		return inserted;
	}
  
	
  public class Element<T1 extends Comparable<? super T>>
  {   
      private T1 data;
      private Element<T1> next;
      public Element(T1 param)
     {
		 data = param;
     }
	  	
   }// end of inner class Node
}//end SinglyLinkedList outer class

