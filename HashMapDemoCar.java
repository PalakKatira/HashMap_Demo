package com.palak.monday_demo;

import java.util.Comparator;
//import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class HashMapDemoCar {
	
	public static void main(String[] args) {
		
		SortedMap<Car,String> owner=new TreeMap<Car,String>();//(new Comparator<Car>() {
//
//			@Override
//			public int compare(Car c1, Car c2) {
//				
//				return Integer.compare(c1.getPrice(), c2.getPrice());
//			}
//			
//		});
		owner.put(new Car("MH211",56000),"Palak");
		owner.put(new Car("MH221",676000),"Punit");
		owner.put(new Car("MH281",96000),"Vibhu");
		owner.put(new Car("MH2178",54647),"Mrunali");

//		System.out.println(owner);
		
//		System.out.println(owner.get(new Car("MH211",56000)));
		
//		//stores keys in keyset
//		Set<Car> owner1=owner.keySet();
//		for(Car c:owner1){
//			System.out.println(c);
//		}
		
		//stores entry that is key and value
		Set<Map.Entry<Car,String>> owner2=owner.entrySet();
		for(Map.Entry<Car,String> c1:owner2){
			System.out.println(c1.getValue()+" "+c1.getKey());
		}
	}


}
