package _23EasyFactory;

public class EasyFactory {
	
	public static Operator createOperate(String operate){
		switch(operate){
			case "+":
				return new Add();
		}
		return null;
	}

}
