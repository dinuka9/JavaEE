package lk.dinuka.singleton;

public class DBAccess {
	//this is the only instance of this class
	private static DBAccess dbinstance = new DBAccess();
	
	public static DBAccess getDBAccessInstace(){
		return dbinstance;
	}
	//block the constructor from creating new instances
	private DBAccess(){
		
	}
	
	String dbName = "projectName";

	public String getDbName() {
		return dbName;
	}
	public void setDbName(String dbName) {
		this.dbName = dbName;
	}
	
}
