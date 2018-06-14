package _06Bridge;

public class MobileMI extends Mobile{

	protected MobileMI(MobileSoft soft) {
		super(soft);
	}

	@Override
	void run() {
		System.out.print("MobileMI	");
		soft.run();
	}

}
