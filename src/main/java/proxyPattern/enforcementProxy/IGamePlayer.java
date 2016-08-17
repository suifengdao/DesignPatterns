package proxyPattern.enforcementProxy;

public interface IGamePlayer {
	public void login(String name,String password);
	public void killBoss();
	public void upgrade();
	public IGamePlayer getProxy();
}
