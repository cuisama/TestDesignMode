package _06Bridge;

public class MobileViVo extends Mobile{

	protected MobileViVo(MobileSoft soft) {
		super(soft);
	}

	public void run() {
		System.out.print("MobileViVo	");
		super.run();
	}

}
