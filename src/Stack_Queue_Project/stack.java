package Stack_Queue_Project;

import java.util.Arrays;

public class stack {

	private int maxSize;
	private int ptrNum;	// the location of the pointer; top of the stack
	private char stackArray[];
	
	// Constructor
	public stack(int capacity) { // Use 'capacity' for number of elements and remove 'maxSize' as a data member
		maxSize = capacity;
		stackArray = new char[maxSize];
		ptrNum = -1;			
	}
	
	// Checks to see if the array is empty
	public boolean isEmpty() {
		if(ptrNum < 0)
			return true;
		else
			return false;
	}
	
	// Checks to see if the array is full
	public boolean isFull() {
		if(ptrNum == (maxSize - 1))
			return true;
		else
			return false;
	}

	// Reset the stack ptrNum to top of stack
	  public void resetPointer() {
		  ptrNum = maxSize - 1;
	 }

	// Push method pushes a value onto the stack
	public void push(char ch) {
		if(!this.isFull()) {
			ptrNum++;
			stackArray[ptrNum] = ch;
		}
	}
	
	// Pop method 'pops' a value off the stack and decrements the value of ptrNum
	public char pop() {	
		
		char character = '\0';

		if(this.isEmpty()) {
			System.out.println("The stack is empty.");
			return '\0';
			
		} else {
			character = (char)stackArray[ptrNum];
			ptrNum--;
		}
		return character;	 
	}
	
	// Top method returns the value of the 'top' of the stack but does not decrement
	public char top() {
		char temp = '0';		
		if(ptrNum > -1)
			temp =  (char)stackArray[ptrNum];
		return temp;		
	}
	
	// Clear the 'stack' of all array contents
	public void clearArray() {
		//stackArray = null;
		Arrays.fill(stackArray, '\0');
	}
	
	@Override
	public String toString() {
		return "stack [maxSize=" + maxSize + ", ptrNum=" + ptrNum + ", stackArray=" + Arrays.toString(stackArray) + "]";
	}
}
