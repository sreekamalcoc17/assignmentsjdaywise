package com.revature.day04.collectionstutorial;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> friends = new ArrayList();
		friends.add("kokoko");
		friends.add("jajaja");
		friends.add("tototo");
		friends.add("lalala");
		friends.add("nanana");
		System.out.println(friends);

		Iterator friendsItr =friends.iterator();
		while(friendsItr.hasNext()) {
			System.out.println(friendsItr.next());
		}
		
		for(String s:friends) {
			System.out.println(s);
		}
	}

}
