package list;



public class CircuitLinkedList<E> implements List<E> {
	
	private int size=0;
	private Node <E> tail=null;
	private Node <E> pos =null;

	@Override
	public void add(E elements) {
		// TODO Auto-generated method stub
		final Node<E> newNode= new Node(elements);
		
		if(tail==null)
		{	
			newNode.next=tail=newNode;
		}else
		{
			/*
			 * 새로운 Node.next는 tail.next
			 * tail.next는 Node가 된다.
			 * tail은 새로운 Node로 되어야 한다.
			 */
			newNode.next=tail.next; //head부분 구현
			tail.next=newNode; //head 연결
			tail=tail.next;	 // tail을 연결시켜줌.
		}
		size++;
	}

	@Override
	public void add(int index, E elements) {
		// TODO Auto-generated method stub

	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		Node<E>x = tail.next;//head부분 지정 -> tail의 next가 head다
		
		if (index == size) {
			throw new IndexOutOfBoundsException("index :" + index + ",size :" + size);
		}
		
		for(int i=0;i<index;i++)
		{
			x=x.next;
		}
		
		return x.data;
	}

	@Override
	public E remove(int index, E elements) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public void removeAll() {
		// TODO Auto-generated method stub
		Node<E> x = tail.next; //head로 이동
		
		while(x!=tail)
		{
			Node<E>next=x.next;
			x.next=null;
			x=next;
		}
		tail.next=null;
		tail=null;
		size=0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		Object [] arr = new Object[size];
		if(tail==null)
		{
			return arr;
		}
		int index=0;
		Node<E> x = tail.next;
		while(true)
		{
			arr[index++]= x.data;
			x=x.next;
			
			if(x==tail.next){//head로 시작해서 head로 돌아온다.
				break;
			}
		}
		return arr;
	}
	public E next()
	{
		return null;
	}
	private class Node<E> {
		private Node<E> next;
		private E data;

		private Node(E element) {
			data = element;
			next = null;
		}

		private Node(E element, Node<E> next) {
			this.data = element;
			this.next = next;
		}
	}

}
