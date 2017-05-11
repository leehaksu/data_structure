package list;

public class DoubleLInkedList<E> implements List<E> {

	private int size;
	private Node<E> head = null;
	private Node<E> tail = null;

	@Override
	public void add(E elements) {
		// TODO Auto-generated method stub
		final Node<E> newNode = new Node(elements);

		if (head == null) {
			head = tail = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		size++;

	}

	/*
	 * head의 뒤 Node의 주소를 temp라는 Node에 임식 기억해 놓는다. NewNode의 next를 temp를 가리키게 한다.
	 * head의 next를 newNode로 가게 한다. temp의 prev는 head를 가리키게 한다.(주소 : temp.prev)
	 * temp.prev=new node를 가리키게 한다.
	 * 
	 */
	@Override
	public void add(int index, E elements) {
		// TODO Auto-generated method stub
		if (size <= index) {
			throw new IndexOutOfBoundsException();
		}
		Node<E> newNode = new Node(elements);
		Node<E> x = head;
		Node<E> temp;
		if (head == null) {
			head = tail = newNode;

		} else if (index == 0) {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		} else {
			for (int i = 0; i < index-1; i++) {
				x = x.next;
			}
			temp = x.next;
			newNode.next = temp;
			x.next = newNode;
			newNode.prev = temp.prev;
			temp.prev = newNode;

		}
		size++;

	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		if (size <= index) {
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
		if (size <= index) {
			throw new IndexOutOfBoundsException("index :" + index + ",size :" + size);
		}
		Node<E> x = head;
		Node<E> temp;
		Node<E> temp2;
		if (head == null) {
			return null;
		} else if (index == 0) {
			temp = x.next;
			temp.prev = null;
			x.next = null;
			head = temp;
		} else if (index == size - 1) {
			temp = x.prev;

		} else {
			for (int i = 1; i < index; i++) {
				x = x.next;
			}
			if (x == tail) {
				temp = x.prev;
				temp.next = null;
				x.prev = null;
				tail = temp;
			} else {
				temp = x.next;
				temp2 = temp.next;
				x.next = temp.next;
				temp2.prev = temp.prev;
			}
		}
		size--;
		return elements;
	}

	@Override
	public void removeAll() {
		// TODO Auto-generated method stub

		Node<E> x = head;
		while (x != null) {
			x.next = null;
			x.prev = null;
			x = x.next;
		}
		head = null;
		tail = null;
		size = 0;

	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	private static class Node<E> {
		private Node<E> next;
		private Node<E> prev;
		private E data;

		private Node(E element) {
			this.data = element;
			this.next = null;
			this.prev = null;
		}

	}

	@Override
	public list.Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
