package _18Prototype;

public class WorkExperience implements IClone {

	String companayName;
	String WorkStartTime;
	
	public WorkExperience(String companayName, String WorkStartTime){
		this.companayName = companayName;
		this.WorkStartTime = WorkStartTime;
	}
	
	@Override
	public Object clone(){
		return new WorkExperience(companayName,WorkStartTime);
	}

	@Override
	public String toString() {
		return "WorkExperience [companayName=" + companayName + ", WorkStartTime=" + WorkStartTime + "]";
	}
}
