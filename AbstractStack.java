/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan10;

/**
 *
 * @author syrly
 */
public class AbstractStack {
     protected int[] arr;
	protected int capacity;
	protected int TOP;
	
	public final int MIN=-1;
		
	public AbstractStack(int capacity) {
		arr = new int[capacity];		
		this.capacity = capacity;
		TOP = MIN;
	}

	public void push(int data)
	{
		if (!isFull()) {
			TOP++;
			arr[TOP]=data;
		}
		else
			System.out.println("Stack Penuh ... ");
	}
	
	public int pop()
	{
		int data = -1;
		if (!isEmpty()) {
			TOP--;
			data = arr[TOP+1];
		}
		else
			System.out.println("Stack Kosong ... ");
		
		return data;
	}
	
	public boolean isFull()
	{
		return TOP == (capacity-1) ? true : false;
	}
	
	public boolean isEmpty()
	{
		return TOP == MIN;
	}

	public int size() 
	{
		return TOP+1;
	}

	public int top() 
	{
		return isEmpty() ? -1 : arr[TOP];
	}

	public String displayStack() {
		String elemen = "";
		for (int i = TOP; i > MIN; i--) {
			elemen=elemen+ arr[i]+ " ";
		}
		return elemen;
	}
}
