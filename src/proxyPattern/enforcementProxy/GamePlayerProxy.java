package proxyPattern.enforcementProxy;

public class GamePlayerProxy implements IGamePlayer{
	private IGamePlayer gamePlayer;
	public GamePlayerProxy(IGamePlayer gamePlayer){
		this.gamePlayer=gamePlayer;
	}
	@Override
	public void login(String name, String password) {
		this.gamePlayer.login(name, password);
	}

	@Override
	public void killBoss() {
		this.gamePlayer.killBoss();
	}

	@Override
	/**
	 * 某个代理行为 被修改
	 */
	public void upgrade() {
		this.gamePlayer.upgrade();
		this.count();
	}
	@Override
	public IGamePlayer getProxy() {
		return this;
	}
	
	/**
	 * 代理类的 个性 方法
	 */
	public void count(){
		System.out.println("升级费用为:￥150");
	}
}
