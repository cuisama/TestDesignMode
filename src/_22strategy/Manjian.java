package _22strategy;

public class Manjian extends Cash{

	@Override
	double method(double money) {
		return money>100?money-10:money;
	}

}
