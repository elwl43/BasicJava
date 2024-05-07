package kr.or.ddit.study13.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * HashMap
 * key와 value로 이루어짐
 * key값은 중복을 허용하지 않고 순서가 보장되지 않음
 * 
 * Map 타입의 대표 컬렉션
 * 
 * 주요 메소드
 * .put(key, value)		: 데이터 입력 key 값은 중복되지 않음, value는 중복 될 수 있음.
 * .get(key)			: 입력 받은 value값은 key 값을 통해 가져올 수 있음
 * .keySet				: key로 이루어진 hashSet 값을 가져옴
 * .containsKey(key)	: key 값이 있는지 확인
 */
public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap();
		map.put("홍길동", 90); // key:주소, value:주소값의 값
		map.put("이순신", 75);
		map.put("홍길동", 84);
		map.put("이성계", 93);
		
//		// 이성계 점수 출력하기
//		int scoreLee = map.get("이성계");
//		System.out.println(scoreLee);
//		// 홍길동 점수 5점 추가 하기
//		int scoreHong = map.get("홍길동");
//		map.put("홍길동", scoreHong);
//		// 전체 출력하기
//		Set<String> keySet = map.keySet();
//		Iterator<String> it = keySet.iterator();
//		while(it.hasNext()) {
//			String key = it.next();
//			System.out.println(key+", "+map.get(key));
//		}
		
		int score = map.get("홍길동");
	}
}
