package proxyPattern;

public class GamePlayer implements IGamePlayer{
	private String name;
	public GamePlayer(String name){
		this.name=name;
	}
	@Override
	public void login(String name, String password) {
		System.out.println("登录名为 "+name+" 的用户 "+this.name+" 登陆成功!");
	}

	@Override
	public void killBoss() {
		System.out.println("用户 "+this.name+" 正在刷怪!");		
	}

	@Override
	public void upgrade() {
		System.out.println("用户 "+this.name+" 升级了!");		
	}

}
