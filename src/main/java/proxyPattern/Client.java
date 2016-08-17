package proxyPattern;

import java.util.Date;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IGamePlayer gamePlayer=new GamePlayer("张三");
		GamePlayerProxy proxy=new GamePlayerProxy(gamePlayer);
		System.out.println("开始时间:"+new Date());
		proxy.login("zhangSan", "123456");
		proxy.killBoss();
		proxy.upgrade();
		
		System.out.println("开始时间:"+new Date());
		gamePlayer.login("zhangSan", "123456");
		gamePlayer.killBoss();
		gamePlayer.upgrade();
	}

}
