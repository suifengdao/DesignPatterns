package proxyPattern.enforcementProxy;

import java.util.Date;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GamePlayer gamePlayer=new GamePlayer("张三");
//		GamePlayerProxy proxy=new GamePlayerProxy(gamePlayer);
		IGamePlayer proxy=gamePlayer.getProxy();
		System.out.println("开始时间:"+new Date());
		proxy.login("zhangSan", "123456");
		proxy.killBoss();
		proxy.upgrade();
	}

}
