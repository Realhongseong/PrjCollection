package Collection1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {

		// 배열 -> ArrayList
		String [] names = {"홍길동","이길동","박길동","김길동"};
		List<String> nameList = Arrays.asList(names);
		
		System.out.println(nameList);
		
		// nameList.add("나길동");  // Arrays.asList() 변환한 List 는 add() 할수없다 <-size()변경불가
		for (int i = 0; i < nameList.size(); i++) {
			String name = nameList.get(i);
			System.out.print(name + " ");
		}
		Collections.sort(nameList);
		System.out.println(nameList);
		
		//sort
		// Collection.sort(nameList); // ascending sort
		
		// 오름차순 정렬된 ArrayList 뒤집기
		Collections.reverse(nameList);	
		System.out.println(nameList);
		
		// 람다식 : (a,b -> a.compareTo(b))
		// bolean function(String a, String b){
		// return a.compareTo(b);
		//}
		
		//오름차순 정렬
		Collections.sort(nameList,(a,b) -> a.compareTo(b));
		System.out.println(nameList);
		
		//내림차순 정렬
		Collections.sort(numList,(a,b) -> a.compareTo(a));
		System.out.println(numList);
		
		Collections.sort(numList, (a,b)-> b-a);
		System.out.println(numList);
	}

}
