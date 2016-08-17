package proxyPattern.generalProxy;

import java.util.Date;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GamePlayerProxy proxy=new GamePlayerProxy("张三");
		System.out.println("开始时间:"+new Date());
		proxy.login("zhangSan", "123456");
		proxy.killBoss();
		proxy.upgrade();
	}

}
