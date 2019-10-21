package com.swiftacad;

import java.util.ArrayList;

public class School {
	private final ArrayList<Class> classes = new ArrayList();
	
	public void assignNewClass(Class newClass) throws Exception {
		if(!classes.contains(newClass)) {
			classes.add(newClass);
		}else {
			throw new Exception("Ма, от дек на дек");
		}
	}
}
