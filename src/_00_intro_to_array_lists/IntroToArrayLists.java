package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
		ArrayList<String> strs = new ArrayList<String>();

		//2. Add five Strings to your list
		strs.add("a");
		strs.add("b");
		strs.add("c");
		strs.add("d");
		strs.add("e");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i<strs.size(); i++){
			System.out.println(strs.get(i));
		}
		//4. Print all the Strings using a for-each loop
		for(String j : strs) {
			System.out.println(j);
		}
		//5. Print only the even numbered elements in the list.
		for(int i = 0; i<strs.size(); i+=2){
			System.out.println(strs.get(i));
		}
		//6. Print all the Strings in reverse order.
		for(int l = (strs.size()-1); l>=0; l--) {
			System.out.println(strs.get(l));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for(int b = 0; b<strs.size(); b++) {
			if(strs.get(b).contains("e")) {
				System.out.println(strs.get(b));
			}
		}
	}
}
