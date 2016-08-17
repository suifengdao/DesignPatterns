package builderPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class CarModel {
	List<String> sequence = new ArrayList<String>();

	protected abstract void start();

	protected abstract void stop();

	protected abstract void alarm();

	public void run() {
		for (String str : sequence) {
			if (str.equals("start")) {
				start();
			} else if (str.equals("stop")) {
				stop();
			} else if (str.equals("alarm")) {
				alarm();
			}
		}
	}

	public void setSequence(List<String> sequence) {
		this.sequence = sequence;
	}
}
