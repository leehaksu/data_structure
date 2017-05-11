package list;

public class LinkedList<E> implements List<E> {

	private int size;
	private Node<E> head;
	private Node<E> tail;

	@Override
	public void add(E elements) {
		// TODO Auto-generated method stub

		Node<E> newNode = new Node<E>(elements);

		newNode.next = head;
		head = newNode;
		

		if (head.next == null) {
			tail = head;
			size++;
		}else
		{
			tail = newNode;
	        // 엘리먼트의 개수를 1 증가 시킵니다.
	        size++;

		}
	}

	@Override
	public void add(int index, E elements) {
		// TODO Auto-generated method stub

	}
	@Override
	public E get(int index) {
		// TODO Auto-generated method stub

		if (index == size) {
			throw new IndexOutOfBoundsException("index :" + index + ",size :" + size);
		}
		Node<E> x = head;
		for (int i = 0; i < index; i++) {
			x = x.next;
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
		System.out.println("체크부분");

		for (Node<E> x = head; x != tail;) {
			Node<E> next = x.next;
			System.out.println("체크2");

			x.data = null;
			x.next = null;
			x = next;
			System.out.println(x+"번째 데이터는 : "+x.data+","+x.next );
		}
		Node<E>x=head;
		while(x!=tail)
		{
			Node<E> next = x.next;
			System.out.println("체크2");

			x.data = null;
			x.next = null;
			x = next;
			System.out.println(x+"번째 데이터는 : "+x.data+","+x.next );
		}

		head = tail;
		tail = null;
		size = 0;

	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
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

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		Object[] arr = new Object[size];
		for( int i=0;i<size;i++)
		{
			//arr[i]=data[i];
		}
		return arr;
	}

}
