package Collection3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap2 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(10, "HR과");
		map.put(20, "자재과");
		map.put(30, "R&D과");
		map.put(40, "총무과");
		map.put(50, "생산과");		
		System.out.println(map);
		System.out.println(map.get(30));
		System.out.println(map.size());
		
		
		map.put(70, "기획과");
		map.put(10, "PR과");
		System.out.println(map);
		System.out.println(map.get(10));
		System.out.println(map.size());
		
		// 모두출력 1.
		System.out.println("1.");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key + ":" + val);
		}
		
		// 모두출력 2.
		// 1. 키 목록 : Set KeySet()
		System.out.println("2.");
		Set<Integer> keySet = map.keySet();
		for (Iterator iterator = keySet.iterator(); iterator.hasNext();) {
			Integer key = (Integer) iterator.next();
			System.out.println(key + "" + map.get(key));
		}
		
		// 모두출력 3.
		// MapEntry<>
		
		
	}

}
