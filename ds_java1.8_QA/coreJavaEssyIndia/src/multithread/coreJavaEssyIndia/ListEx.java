package multithread.coreJavaEssyIndia;

import java.util.*;

public class ListEx {
	public static void practiceListEx(){
		ArrayList objArrayList=new ArrayList();
		Vector objVector=new Vector();
		LinkedList objLinkedList=new LinkedList();
		
		objArrayList.add(0,15);
		objVector.add(0,16);
		objLinkedList.add(0,17);
		objArrayList.add(1,'c');
		objVector.add(1,'d');
		objLinkedList.add(1,'e');
		objArrayList.add(2,true);
		objVector.add(2,false);
		objLinkedList.add(2,true);
		objArrayList.add(3,"ArrayList");
		objVector.add(3,"Vector");
		objLinkedList.add(3,"LinkedList");
		
		/*--------ALL THE BELOW ITERATOR ARE FAIL FAST ITERATOR--------*/
		System.out.println("--Iteration Over ArrayList--");
		Iterator itrArrayList=objArrayList.iterator();	
		while(itrArrayList.hasNext()){ 
			System.out.print(itrArrayList.next()+", "); 
		}
		
		ListIterator listItrArrayList=objArrayList.listIterator();	
		System.out.print(" | ");
		while(listItrArrayList.hasNext()){ 
			System.out.print(listItrArrayList.next()+", ");
		}
		if(listItrArrayList.hasPrevious())
			System.out.print(listItrArrayList.previous()+", ");
		

		System.out.print(" | ");
		for (Object obj : objArrayList) {
			System.out.print(obj+", ");
		}
		System.out.println("\n--End--\n");
		
		System.out.println("--Iteration Over Vector--");
		Iterator itrVector=objVector.iterator();	
		while(itrVector.hasNext()){ 
			System.out.print(itrVector.next()+", "); 
		}	
		
		ListIterator listItrVector=objVector.listIterator();
		System.out.print(" | ");	 
		while(listItrVector.hasNext()){ 
			System.out.print(listItrVector.next()+", "); 
		}
		if(listItrVector.hasPrevious())
			System.out.print(listItrVector.previous()+", ");
		System.out.println("\n--End--\n");
		
		System.out.println("--Iteration Over LinkedList--");
		Iterator itrLinkedList=objLinkedList.iterator();
		while(itrLinkedList.hasNext()){ 
			System.out.print(itrLinkedList.next()+", ");	 
		}
		
		ListIterator listItrLinkedList=objLinkedList.listIterator();
		System.out.print(" | ");
		if(listItrLinkedList.hasNext())
		listItrLinkedList.next();
		while(listItrLinkedList.hasPrevious()){ 
			System.out.print(listItrLinkedList.previous()+", "); 
		}
		
		Iterator itrLinkedListRev=objLinkedList.descendingIterator();
		System.out.print(" | ");
		while(itrLinkedListRev.hasNext()){ 
			System.out.print(itrLinkedListRev.next()+", ");	 
		}
		System.out.println("\n--End--\n");
		
		
	}
	public static void main(String[] args) {
		practiceListEx();
	}
}
