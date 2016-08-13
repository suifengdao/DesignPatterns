package builderPattern;

import java.util.List;

public class BMWBuilder extends CarBuilder{
	private BMWModel bmw=new BMWModel();
	@Override
	public void setSequence(List<String> sequence) {
		this.bmw.setSequence(sequence);
		
	}

	@Override
	public BMWModel getCarModel() {
		return this.bmw;
	}

}
