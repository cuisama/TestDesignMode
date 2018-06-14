package _18Prototype;

public class Introduce implements IClone{
	
	String name;
	int age;
	
	WorkExperience workExperience;
	
	
	public Introduce(String name, int age, WorkExperience workExperience){
		this.name = name;
		this.age = age;
		this.workExperience = workExperience;
	}
	
	@Override
	public Object clone(){
		//浅复制
		//return this;		
		//return new Introduce(this.name,this.age, this.workExperience);
		//深复制
		return new Introduce(this.name,this.age, (WorkExperience)workExperience.clone());
	}

	@Override
	public String toString() {
		return "Introduce [name=" + name + ", age=" + age + ", workExperience=" + workExperience + "]";
	}
}
