package proxyPattern.generalProxy;

public class GamePlayerProxy implements IGamePlayer{
	private IGamePlayer gamePlayer=null;
	public GamePlayerProxy(String name){
		try{
			gamePlayer=new GamePlayer(this, name);
		}catch(Exception e){}
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
	public void upgrade() {
		this.gamePlayer.upgrade();
	}

}
