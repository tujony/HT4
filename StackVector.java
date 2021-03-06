import java.util.Vector;
/**
 * 
 *  @author Jonathan Espinoza 20022
 * @author Juan Andres Galicia 20298
 * @version 23-2-2021
 *
 *
 * @param <E>
 */
public class StackVector<E>
 extends AbstractStack<E>
{
	protected Vector<E> data;
	/**
	 * 
	 */
	public StackVector()
	// post: constructs a new, empty stack
	{
		data = new Vector<E>();
	}
	/**
	 * 
	 */
	public void push(E item)
	// post: the value is added to the stack
	//          will be popped next if no intervening push
	{
		data.add(item);
	}
	/**
	 * 
	 */
	public E pop()
	// pre: stack is not empty
	// post: most recently pushed item is removed and returned
	{
		return data.remove(size()-1);
	}
	/**
	 * 
	 */
	public E peek()
	// pre: stack is not empty
	// post: top value (next to be popped) is returned
	{
		return data.get(size() - 1);
	}
	/**
	 * 
	 */
	public int size()
	// post: returns the number of elements in the stack
	{
		return data.size();
	}
  
	
}