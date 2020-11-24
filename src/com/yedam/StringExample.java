package com.yedam;

import java.io.IOException;

public class StringExample {
	public static void main(String[] args) {
		String str1 = new String();
		str1 = "Hello";
		byte [] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		String str2 = new String(bytes);
		System.out.println(str2.toString()); //Hello Java나온다, 72=H, 101=e, 108=l......
		
		String str3 = new String(bytes, 6, 4);
		System.out.println(str1 +" " +str3.toString());
		
		byte[] bytes2 = new byte[100];
//		try {
//			int readByteNo = System.in.read(bytes2);
//			String str4 = new String(bytes2, 0, readByteNo); //0~readByteNo만큼을 str4에 넣겠다 
//			System.out.println(str4);                        //F11에 nice넣으면 nice 나온다
//		} catch (IOException e) {                            //빨간줄 뜨면 밑에 뭐 누르면 catch 나온다
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		char chr = str2.charAt(0); //str2의 첫번째 값(0)이 나오게, char은 문자변환변수지정
		System.out.println(chr);
		
		
		
	}
}
