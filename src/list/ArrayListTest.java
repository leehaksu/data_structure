package list;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> list = new ArrayList <Integer>();
		//add 연산
		list.add(11);
		list.add(22);
		list.add(22);
		list.add(33);
		list.add(44);
		list.add(44);
		
		//사이즈 연산
		int count=list.size();
		System.out.println("리스트 크기:"+count);
		
		//get 연산 테스트
		for(int i=0;i<count;i++)
		{
			System.out.println(i+"번째 항목 : "+list.get(i));
		}
		
		//foreach문을 사용하기 위한 컬렉션 객체는 java.lang.iterable 인터페이스를 구현 해야 한다.
		/*for(Integer i : list)
		{
			System.out.println(i+"번째 항목 : "+list.get(i));
		}*/
		
		//Iterator 반복자를 통한 리스트 순회
		Iterator <Integer> it = list.iterator();
		while(it.hasNext())
		{
			int i=it.next();
			System.out.println(i);
		}
		//removeAll 테스트
		list.removeAll();
		
		//size 연산
		count=list.size();
		System.out.println("리스트 크기:"+count);
		try
		{
			System.out.println(list.get(0));
		}catch(IndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		
		

	}

}
