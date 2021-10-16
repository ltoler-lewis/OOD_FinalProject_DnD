//Will include implementation of Equipment iterator

import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Bag implements EquipmentIterator, Observer {
	List<Equipment> items;
	int position = 0;
	int maxSize;
	//Figure out how to reference STR of Character to get actual maximum size
	//FIXME
	//Character owner;
	//MAKE THIS OBSERVER AND UPDATE WHENEVER STR IS CHANGED 
 
	public Bag(List<Equipment> items) {
		this.items = items;
		
		//FIXME - Replace with reference to Character's STR
		maxSize = items.size();
	}
	
	public Bag (int size) {
		maxSize = size;
	}
 
	public Equipment next() {
		
		Equipment item = items.get(position);
		position = position + 1;
		return item;

	}
 
	public boolean hasNext() {

		if (position >= items.size()) {
			return false;
		} 
		else {
			return true;
		}
		
	}
	
	public Equipment getItem(String name) {
		for(int x = 0; x < items.size(); x++){
			if(items.get(x).name.equals(name)) {
				Equipment item = items.get(x);
				items.remove(x);
				return item;
			}
		}
		System.out.println("You don't have a(n) " + name);
		return null;
		
	}
	
	public String getContents() {
		String output = "The contents of your bag are: \n";
		for (int x = 0; x < items.size(); x++) {
			output += items.get(x).name;
			output += "  ";
		}
		return output;
	}
	//for when we are lazy
	public void printContents() {
		String output = "The contents of your bag are: \n";
		for (int x = 0; x < items.size(); x++) {
			output += items.get(x).name;
			output += "  ";
		}
		System.out.println(output);
	}

	@Override
	public void update(int strength) {
		maxSize = strength * 5;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String readIn = "";
		while (maxSize < items.size()) {
			System.out.println("You are holding too many items. Please choose something to remove.");
			printContents();
			
		 
		        // Reading data using readLine
		        try {
		        	readIn = reader.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
		        getItem(readIn);
		}
		
		
	}
	
	
	
	
	
}


	
