//Will include implementation of Equipment iterator

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Bag implements EquipmentIterator, Observer {
	List<Equipment> items = new ArrayList<Equipment>();;
	int position = 0;
	double maxWeight;
	double currentWeight=0;

	
	public Bag (Character c) {
		c.registerSTRObserver(this);
		update(c.getStr());
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
				currentWeight=currentWeight-item.weight;
				items.remove(x);
				return item;
			}
		}
		System.out.println("You don't have a(n) " + name);
		return null;
		
	}
	
	public void addItem(Equipment e) {
		if((currentWeight+e.weight)<maxWeight) {
			items.add(e);
			currentWeight+=e.weight;
			//System.out.println(e.name);
			//System.out.println(currentWeight);
		}
		else {
			System.out.println ("You do not have the strength to carry this item");
		}
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
		maxWeight = strength * 5;
		//System.out.println("Max weight: " + maxWeight);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String readIn = "";
		while (maxWeight < currentWeight) {
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


	
