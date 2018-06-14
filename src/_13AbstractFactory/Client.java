package _13AbstractFactory;

public class Client {

	public static void main(String args[]){
//		IFactory f1 = new SqlserverFactory();
		IFactory f1 = new OracleFactory();
		IDepartment d1 = f1.createDepartment();
		d1.insert(new Department());	
		d1.getDepartment(1);
	}
}
