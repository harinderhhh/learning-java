package com.harinder.huawei;

public class StringReverse {
	public String reverseString(String str) {
		if (str.isEmpty()) {
			return str;
		} else {
			return reverseString(str.substring(1)) + str.charAt(0);
		}
	}

	public static void main(String[] args) {
		StringReverse obj = new StringReverse();
		String result = obj.reverseString("Harinder");
		System.out.println(result);
	}
}