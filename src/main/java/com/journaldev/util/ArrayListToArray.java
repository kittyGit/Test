package com.journaldev.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {

	public static void main(String[] args) {
		
		List<String> arrayList=new ArrayList<String>();
		arrayList.add("1");
		arrayList.add("2");
		arrayList.add("3");
		
		String[] str=null;
		str=arrayList.toArray(new String[arrayList.size()]);
		System.out.println(Arrays.toString(str));
	}
}
