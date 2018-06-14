package _21Decorator;

public class Decorator extends Component {

	protected Component component;
	
	public void SetComponent(Component component){
		this.component = component;
	}
	
	@Override
	void operation() {
		if(component != null){
			component.operation();
			System.out.println("Decorator");
		}
	}

}
