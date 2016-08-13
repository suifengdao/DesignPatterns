package proxyPattern.enforcementProxy;

public class GamePlayer implements IGamePlayer{
	private String name;
	private IGamePlayer proxy=null;
	public GamePlayer(String name) {
		this.name=name;
	}
	@Override
	public void login(String name, String password) {
		if(this.isProxy()){
			System.out.println("登录名为 "+name+" 的用户 "+this.name+" 登陆成功!");			
		}else{
			System.err.println("请使用指定的代理访问!");
		}
	}

	@Override
	public void killBoss() {
		if(this.isProxy()){
			System.out.println("用户 "+this.name+" 正在刷怪!");	
		}else{
			System.err.println("请使用指定的代理访问!");
		}
	}

	@Override
	public void upgrade() {
		if(this.isProxy()){
			System.out.println("用户 "+this.name+" 升级了!");	
		}else{
			System.err.println("请使用指定的代理访问!");
		}
	}
	@Override
	public IGamePlayer getProxy() {
		this.proxy=new GamePlayerProxy(this);
		return this.proxy;
	}
	
	private boolean isProxy(){
		if(this.proxy==null){
			return false;
		}else{
			return true;
		}
	}

}
