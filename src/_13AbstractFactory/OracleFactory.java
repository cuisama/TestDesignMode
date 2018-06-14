package _13AbstractFactory;

public class OracleFactory implements IFactory{

	@Override
	public IUser createUser() {
		return null;
	}

	@Override
	public IDepartment createDepartment() {
		return new OracleDepartment();
	}

}
