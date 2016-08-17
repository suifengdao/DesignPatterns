package builderPattern;

import java.util.List;

public class BenzBuilder extends CarBuilder{
	private BenzModel benz=new BenzModel();
	@Override
	public void setSequence(List<String> sequence) {
		this.benz.setSequence(sequence);
	}

	@Override
	public BenzModel getCarModel() {
		return this.benz;
	}

}
