package com.journaldev.util;

import java.util.Arrays;

public class JavaSplitString {
	public static void main(String[] args) {
		//分割方式1
		String line="i am Kitty";
		String[] names=line.split(" ");
		
		//将输入字符串分割成指定具体数量的String数组
		String[] twoName=line.split(" ",2);
		System.out.println("String split with delimiter"+Arrays.toString(names));
		System.out.println("String split into two"+Arrays.toString(twoName));
		
		System.out.println("_______________________________________");
		
		//分割方式2
		String myName="i|am|Kitty";
		String[] splitString=myName.split("\\|");
		System.out.println("String split with special character"+Arrays.toString(splitString));
		
	}

}
