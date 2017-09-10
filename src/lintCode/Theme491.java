package lintCode;

/**
 * 回文数 
 * @author zhangjunyang 2017年9月10日 下午4:35:01
 */
public class Theme491 {
	
	public static void main(String[] args) {
		System.out.println(new Theme491().isPalindrome(11));
	}
	
    /**
     * 可以使用StringBuilder的reverse方法对String进行翻转判断
     */
    public boolean isPalindrome(int num) {
    	if (num < 0)
    		return false;
    	String str = "" + num;
    	int len = str.length();
    	for (int i = 0, j = len - 1; i < len; i++, j--) {
    		char start = str.charAt(i);
    		char end = str.charAt(j);
    		if (start != end) {
    			return false;
    		}
    	}
    	return true;
    }
}