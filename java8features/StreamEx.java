package java8features;

import java.util.ArrayList;

public class StreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>list=new ArrayList<>();
		list.add("Karthikadevi");
		list.add("Varshini");

		list.add("Lakshmi");

		list.add("Muthu");

		list.add("Devi");
		int count=0;
		for(String string :list) {
			if(string.length()<7) {
				count ++;
			}
		}
		System.out.println("There are "+count+" strings with length less than 7");
		long count1=list.stream().filter(str->str.length()<7).count();
		System.out.println("There are "+count1+" strings with length less than 7");


	}

}
