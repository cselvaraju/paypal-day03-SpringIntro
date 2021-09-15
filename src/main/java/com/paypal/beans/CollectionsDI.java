package com.paypal.beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class CollectionsDI {

	private ArrayList<Integer> myList;
	private HashMap<Integer, String> myMap;
	private Set<Integer> mySet;

	public ArrayList<Integer> getMyList() {
		return myList;
	}

	public void setMyList(ArrayList<Integer> myList) {
		this.myList = myList;
	}

	public HashMap<Integer, String> getMyMap() {
		return myMap;
	}

	public void setMyMap(HashMap<Integer, String> myMap) {
		this.myMap = myMap;
	}

	public Set<Integer> getMySet() {
		return mySet;
	}

	public void setMySet(Set<Integer> mySet) {
		this.mySet = mySet;
	}

	@Override
	public String toString() {
		return "CollectionsDI:\n" + 
				"myList: " + myList + "\n" + 
				"myMap: " + myMap + "\n" + 
				"mySet: " + mySet;
	}

}
