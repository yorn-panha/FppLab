package lab11.prog11_2_schur;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Schur {
//	int flag = 0;
	boolean checkForSum(List<Integer> list, Integer z) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		//Iterator<Integer> listIt = list.iterator();
		//List<Integer> newList = new ArrayList<Integer>();
		for(int i = 0; i<list.size();i++) {
			int l = z - list.get(i);
			map.put(l, l);
		}
		for(int i =0; i<list.size(); i++){
			if(map.containsKey(list.get(i)))
				return true;
		}
		return false;
//		while(listIt.hasNext()) {
//			Integer el = listIt.next();
//			if(!alrChecked.containsKey(el)) {
//				alrChecked.put(el, el);
//				
//				newList.forEach(value -> {
////						if(value + el == z) {
////							//System.out.print(value + " " + el + " " + z + " " + flag);
////							flag = 1;
////						}
////					}
////				);
////				if(flag == 1) return true;
//					
//					
//				newList.add(el);
//			}
//		}
//		/*System.out.println(newList);
//		for(int i = 0; i < newList.size()-1; i++) {
//			for(int j = i+1; j < newList.size(); j++) {
//				if(newList.get(j) + newList.get(j) == z) {
//					return true;
//				}
//			}
//		}*/
//		
//		return false;
		
	}
	public static void main(String[] args) {
		Schur sc = new Schur();
		List<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(14);
//		list.add(5);
		
		list.add(3);
//		list.add(4);
		list.add(7);
//		for(int i = 0; i < 20; i++) {
//			list.add(i);
//		}
		//System.out.println(list.toString());
		boolean bl = sc.checkForSum(list, 8);
		System.out.println(bl);
	}
}
