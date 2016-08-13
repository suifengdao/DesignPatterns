package templateMethodPattern;

public abstract class HummerModel {
	protected abstract void start();
	protected abstract void stop();
	protected abstract void alarm();
	
	/**
	 * 模板方法， 由父类的其它基本操作/方法 组合
	 */
	protected void run(){
		start();
		if(isAlarm()){
			alarm();
		}
		stop();
	}
	/**
	 * 钩子函数， 帮助子类影响父类行为的函数
	 * @return boolean 是否鸣笛
	 */
	protected boolean isAlarm(){
		return true;
	}
}
