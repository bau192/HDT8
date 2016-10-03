/*
*declaracion de la interface PriorityQeue
*/
public interface PriorityQeue<E> {

	public boolean isEmpty();
	
	public E getFirst();
	
	public E removeFirst();
	
	public void add(E val);
	}
