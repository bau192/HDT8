import java.util.*;

public class VectorHeap<E extends Comparable<E>>implements PriorityQeue<E> {
	
	private Vector<E> vector;
	private int size;
	private E temporal;
	
	public VectorHeap(){
		vector = new Vector<E>();
		size = 0;
	}
	
	public boolean isEmpty(){
		return size==0;
	}
	
	public E getFirst(){
		return vector.firstElement();
	}
	
	public E removeFirst(){
		if (isEmpty()){
			return("Is empty");
		}
		return temporal = vector.remove(0);
		size--;
		
		
	}
}
