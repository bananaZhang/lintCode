package lintCode;

import java.util.Arrays;

/**
 * 字符串置换
 * 给定两个字符串，请设计一个方法来判定其中一个字符串是否为另一个字符串的置换。
 * @author zhangjunyang 2017年6月25日 下午8:59:55
 */
public class Theme211 {

	public boolean stringPermutation(String A, String B) {
		if (A == null || B == null) {
			return false;
		}
		int lenA = A.length();
		int lenB = B.length();
		if (lenA == 0 && lenB == 0) {
			return true;
		}
		if (lenA != lenB) {
			return false;
		}
		char[] charArrA = A.toCharArray();
		char[] charArrB = B.toCharArray();
		Arrays.sort(charArrA);
		Arrays.sort(charArrB);
		String strA = new String(charArrA);
		String strB = new String(charArrB);
		return strA.equals(strB);
    }
	
	public static void main(String[] args) {
		String str1 = "abcd";
		String str2 = "dcca";
		System.out.println(new Theme211().stringPermutation(str1, str2));
	}
}
