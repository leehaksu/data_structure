package list;


public class ArrayList<E> implements List<E> {
	private static final int INIT_CAPACITY=10;
	private int size;
	private E[] data;
	
	@SuppressWarnings("unchecked")
	public ArrayList() {
		// TODO Auto-generated constructor stub
		size=0;
		resize();
	}
	
	private void resize()
	{
		int capacity=(data==null)?INIT_CAPACITY:data.length*2;
		E[]	temp = (E[])new Object[capacity];
		for(int i=0;i<size;i++)
		{
			temp[i]=data[i];
		}
		data=temp;
	}

	@Override
	public void add(E elements) {
		// TODO Auto-generated method stub
		if(data.length<=size)
		{
			resize();
		}
		data[size]=elements;
		size++;
	}

	@Override
	public void add(int index, E elements) {
		// TODO Auto-generated method stub

	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		if(index==size)
		{
			throw new IndexOutOfBoundsException("index :"+index + ",size :" + size);
		}
		return data[index];
	}

	@Override
	public E remove(int index, E elements) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeAll() {
		// TODO Auto-generated method stub
		for(int i=0;i<size;i++)
		{
			data[i]=null;
		}
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
		Object[] arr = new Object[size];
		//Node <E> x = head;
		int index=0;
	/*	while(x!=null)
		{
			arr[index++]=x.data;
			x=x.next;
		}*/
		return arr;
	}
	

	@Override
	public list.Iterator<E> iterator() {
		// TODO Auto-generated method stub
		
		
		return new list.Iterator<E>(){
			
			private int index=0;

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return index<size;
			}

			@Override
			public E next() {
				// TODO Auto-generated method stub
				return data[index++];
			}
			
		};
	}


}
