package list;

public interface List <E> {
	
	void add(E elements);
	void add(int index,E elements);
	E get(int index);
	E remove(int index,E elements);
	void removeAll();
	int size();
	Object [] toArray();
	
	
	
	

}
