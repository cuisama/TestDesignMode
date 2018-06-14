package _13AbstractFactory;

public class SqlserverDepartment implements IDepartment{

	@Override
	public void insert(Department department) {
		System.out.println("SqlserverDepartment.insert");
	}

	@Override
	public Department getDepartment(int id) {
		System.out.println("SqlserverDepartment.getDepartment");
		return null;
	}

}
