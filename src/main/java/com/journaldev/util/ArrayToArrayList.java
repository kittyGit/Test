package com.journaldev.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args) {
		// 练习将数组转换成ArrayList
		String[] strs = { "1", "2", "3", "4" };
		List<String> arrayList = new ArrayList<String>();
		
		// 转换方式一
		arrayList = Arrays.asList(strs);
		System.out.println("Original ArrayList form Arrays.asList");

		for (String str : arrayList)
			System.out.println("" + str);

		// 改变了原数组的第一个元素，arrayList的元素也随之改变
		strs[0] = "5";
		System.out.println("\nChange in array effect on ArrayList");

		for (String str : arrayList)
			System.out.println("" + str);
		
		
		arrayList = new ArrayList<String>();
		
		// 转换方式二
		String[] strs2 = { "11", "12", "13", "14" };
		Collections.addAll(arrayList, strs2);
		for (String str : arrayList)
			System.out.println("" + str);
		
		arrayList.add("15");
		
		// 改变了原数组的第一个元素，arrayList的元素不会随之改变
		strs2[0] = "100";
		System.out.println("\nArray to ArrayList using Collections.addAll()");
		for (String str : arrayList)
			System.out.println("" + str);
	}

}
