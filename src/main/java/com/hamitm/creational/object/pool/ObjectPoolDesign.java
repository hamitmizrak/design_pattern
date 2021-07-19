package com.hamitm.creational.object.pool;

import java.util.ArrayList;
import java.util.List;

public class ObjectPoolDesign {
	
	// Class object
	// singleton design pattern
	protected static ObjectPoolDesign objectPoolDesign;
	
	private final static short MaxPoolSize = 15;
	private static List<UsesObjectDesign> usesObjectlist;
	
	// parametresiz constructor
	// singleton design pattern
	protected ObjectPoolDesign() {
		usesObjectlist = new ArrayList<UsesObjectDesign>();
	}
	
	// singleton design pattern
	public static ObjectPoolDesign getObjectPoolDesign() {
		if (objectPoolDesign == null) {
			objectPoolDesign = new ObjectPoolDesign();
			for (int i = 0; i < MaxPoolSize; i++) {
				UsesObjectDesign list = new UsesObjectDesign();
				usesObjectlist.add(list);
			}
		}
		return objectPoolDesign;
	}
	
	// false dizileri
	public UsesObjectDesign getUsesObjectDesign() {
		for (UsesObjectDesign temp : usesObjectlist) {
			if (!temp.isActive()) {
				return temp;
			}
		}
		return null;
	}
	
	// kullanmadığımız nesneleri tekrar iade etmeliyiz
	public void lendItBack(UsesObjectDesign usesObjectDesign) {
		usesObjectDesign.setActive(false);
	}
	
}
