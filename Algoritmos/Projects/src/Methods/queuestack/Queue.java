package Methods.queuestack;
import java.io.Serializable;

import Methods.listarray.ListArray;
import Methods.listdouble.TADProj.src.br.pucrs.adt.ListDoubleLinked;
import Methods.listdouble.TADProj.src.br.pucrs.adt.ListTAD;
import Methods.*;

public class Queue<T extends Comparable<T>> implements QueueTAD<T>, Serializable {
	// private ListTAD<T> lst = new ListDoubleLinked<T>();
	private ListTAD<T> lst = new ListDoubleLinked<T>();
	
	public void enqueue(T dado)
	{
		if (dado != null)
			lst.add(dado);
		else
			throw new IllegalArgumentException();
	}
	
	public T dequeue()
	{
		T res = null;
		
		res = lst.remove(0);
		if (res == null)
			throw new EmptyQueueException();
		else 
			return res;
	}
	
	public T first()
	{
		T res = null;
		
		res = lst.get(0);
		if (res == null)
			throw new EmptyQueueException();
		else 
			return res;
	}
	
	public boolean isEmpty()
	{
		return lst.isEmpty();
	}
	
	public int size()
	{
		return lst.size();
	}
}
