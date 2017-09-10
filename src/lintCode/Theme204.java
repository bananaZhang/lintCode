package lintCode;

/**
 * 单例
 * @author zhangjunyang 2017年6月25日 下午8:55:17
 */
public class Theme204 {
	private static Theme204 instance;
	
	public static Theme204 getInstance() {
		if (instance == null) {
			instance =  new Theme204();
		}
		return Theme204.instance;
	}
}
