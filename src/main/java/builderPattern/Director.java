package builderPattern;

import java.util.ArrayList;
import java.util.List;

public class Director {
	public BenzModel getBenzModelA(){
		List<String> sequence=new ArrayList<String>();
		sequence.add("start");
		sequence.add("stop");
		sequence.add("alarm");
		BenzBuilder benzBuilder=new BenzBuilder();
		benzBuilder.setSequence(sequence);
		return benzBuilder.getCarModel();
	}
	
	public BenzModel getBenzModelB(){
		List<String> sequence=new ArrayList<String>();
		sequence.add("start");
		sequence.add("alarm");
		sequence.add("stop");
		BenzBuilder benzBuilder=new BenzBuilder();
		benzBuilder.setSequence(sequence);
		return benzBuilder.getCarModel();
	}
	
	public BMWModel getBMWModelA(){
		List<String> sequence=new ArrayList<String>();
		sequence.add("start");
		sequence.add("stop");
		sequence.add("alarm");
		BMWBuilder bmwBuilder=new BMWBuilder();
		bmwBuilder.setSequence(sequence);
		return bmwBuilder.getCarModel();
	}
	
	public BMWModel getBMWModelB(){
		List<String> sequence=new ArrayList<String>();
		sequence.add("start");
		sequence.add("alarm");
		sequence.add("stop");
		BMWBuilder bmwBuilder=new BMWBuilder();
		bmwBuilder.setSequence(sequence);
		return bmwBuilder.getCarModel();
	}
}
