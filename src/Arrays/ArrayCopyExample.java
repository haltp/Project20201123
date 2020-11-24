package Arrays;

import java.util.Arrays;

public class ArrayCopyExample {
	public static void main(String[] args) {
		char[] arr1 = { 'J', 'A', 'V', 'A' };

		// 방법1
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr2));
		// [J, A, V, A]

		// 방법2
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
		System.out.println(Arrays.toString(arr3));
		// [A, V]

		// 방법3
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length); //원본배열, 원본시작인덱스, 타겟배열, 타겟시작인덱스, 복사갯수
		for (int i = 0; i < arr4.length; i++) {
			System.out.println("arr4[" + i + "]=" + arr4[i]);
		//arr4[0]=J
		//arr4[1]=A
		//arr4[2]=V
		//arr4[3]=A
		}
	}
}
