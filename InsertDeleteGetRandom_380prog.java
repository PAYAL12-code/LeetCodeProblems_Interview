package LeetCodeImportantInterviewQus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class InsertDeleteGetRandom_380prog {
public static void main(String[] args) {
	
}
}
class Randomset{
HashMap<Integer, Integer> hm;
	
	List<Integer> list;
	public Randomset() {
		 hm =  new HashMap<>();
		 list = new ArrayList<>();
	}
	public boolean inser(int val) {
		if(hm.containsKey(val)) return false;
		list.add(val);
		hm.put(val, list.size()-1);//put value and index
		return true;
	}
	
	public boolean remove(int val) {
		if(hm.containsKey(val)== false)
			return false;
		int ind = hm.get(val);
		Collections.swap(list, ind, list.size()-1);
		int swappedwith = list.get(ind);
		hm.put(swappedwith, ind);
		list.remove(list.size()-1);
		hm.remove(val);
		return true;
	}
	public int getRandom() {
		Random random = new Random();
		int n= random.nextInt(list.size());
		return list.get(n);
	}
	
}




