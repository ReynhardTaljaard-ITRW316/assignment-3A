import java.util.Scanner;
public class Driver extends Memory
{
	public static void main(String [] args)
	{
		Scanner read = new Scanner(System.in);
		int memorySize = 0;
		SLL<String> myList = new SLL<String>();
	 
		System.out.print(" insert page table size: ");
		memorySize = read.nextInt();
		
		
		
		System.out.println(memorySize);
	 
		for(int i = 0;i < memorySize;i++)
		{
			System.out.print("enter page reference name(example A,B,C): ");
			myList.append(read.next());
		}
		 System.out.println();
		 myList.showAll();
		 System.out.println();
		 System.out.println();
		 
		 
		 boolean test2 = false;
		 while(test2== false)
		 {
			 
			String temp;
			boolean  test = false;
			System.out.print("enter next page name to enter list: ");
			temp = read.next();
			test = myList.delete(temp);
			
			if (test == true)
			{
				myList.append(temp);
			}
			else
			{
				myList.deleteHead();
				myList.append(temp);
			}
			System.out.println();
			myList.showAll();
			System.out.println();
			System.out.println();
			
			System.out.print("continue? (yes = 1/ no = 0)");
			int opt = read.nextInt();
			if(opt==0)
				test2 = true;
			else 
				test2 = false;
			
		 }
	 
	 
	 /*System.out.println("\nInitial list: ");
	 myList.showAll();
	 
	 System.out.println("\nAdd One item: ");// Add item to Empty list
	 myList.intsertSorted(new Integer(3));
	 myList.showAll();
	 
	 System.out.println("\nAdd One smaller than head:");// Add item to Empty list
	 myList.intsertSorted(new Integer(2));
	 myList.showAll();
	 System.out.println("\nAdd One larger than the last one:");// Add item to Empty list
	 myList.intsertSorted(new Integer(9));
	 myList.showAll();
	 System.out.println("\nAdd One in the middle:");// Add item to Empty list
	 myList.intsertSorted(new Integer(5));
	 myList.showAll();*/
	}
}