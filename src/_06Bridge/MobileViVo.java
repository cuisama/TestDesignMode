package _06Bridge;

public class MobileViVo extends Mobile{

	protected MobileViVo(MobileSoft soft) {
		super(soft);
	}

	@Override
	void run() {
		System.out.print("MobileViVo	");
		soft.run();
	}

}
