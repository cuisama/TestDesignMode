package _13AbstractFactory;

/**
 * 返回用户类
 * @author 8LB11L2
 *
 */
public class SqlserverFactory implements IFactory{

	@Override
	public IUser createUser() {
		//System.out.println("SqlserverFactory.IUser");
		return null;
	}

	@Override
	public IDepartment createDepartment() {
		//System.out.println("SqlserverFactory.CreateDepartment");
		return new SqlserverDepartment();
	}

}
