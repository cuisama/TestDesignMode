package _13AbstractFactory;

/**
 * 简单工厂改进抽象工厂
 * 本类替换IFactory，SqlserverFactory,OracleFactory
 * @author 8LB11L2
 *
 */
public class DataAccess {
	private static final String ORACLE = "ORACLE";
	private static final String SQLSERVER = "SQLSERVER";
	private String DB = ORACLE;
	
	public IUser createUser(){
		return null;
	}
	
	public IDepartment createDepartment(){
		IDepartment idept = null;
		switch(DB){
			case ORACLE:
				idept = new OracleDepartment();
				break;
			case SQLSERVER:
				idept = new SqlserverDepartment();
				break;
		}
		return idept;
	}

}
