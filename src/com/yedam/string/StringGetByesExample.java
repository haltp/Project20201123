package com.yedam.string;

import java.io.UnsupportedEncodingException;

public class StringGetByesExample {
	public static void main(String[] args) {
		String str = "ㄹㄹㄹㄹ";

		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length: " + bytes1.length); // bytes1.length: 15 나온다
		String str1 = new String(bytes1);
		System.out.println("bytes1->String: " + str1); // bytes1->String: 안녕하세요
		
		System.out.println("------------------");
		try {

			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length: " + bytes2.length); // bytes2.length: 10 나온다
			String str2 = new String(bytes1);
			System.out.println("bytes2->String: " + str2); // bytes2->String: 안녕하세요

			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes3.length: " + bytes3.length); // bytes2.length: 15 나온다
			String str3 = new String(bytes1);
			System.out.println("bytes3->String: " + str3); // bytes2->String: 안녕하세요

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

	}
}
