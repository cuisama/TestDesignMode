package _15Builder;

public class Director {

//	private Builder builder;
//	
//	public Director(Builder builder){
//		this.builder = builder;
//	}
	
	public void Construct(Builder builder){
		builder.takeCoat();
		builder.takePants();;
		builder.takeShoe();
	}
}
