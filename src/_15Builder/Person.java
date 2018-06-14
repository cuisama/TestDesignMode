package _15Builder;

import java.util.ArrayList;
import java.util.List;

public class Person {
	
	List<String> clothesList = new ArrayList<String>();
	
	public void Dress(String clothes){
		clothesList.add(clothes);
	}
	
	public void show(){
		for(String s:clothesList){
			System.out.print(s+" ");
		}
		System.out.println("");
	}

}
