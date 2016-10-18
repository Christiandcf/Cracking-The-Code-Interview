package OnlineReader;

public class User {
	private int userId;
	private String details;
	private int accountType;
	
	public void renewMembership(){ }
	
	// Constructs the User
	public User(int id, String details, int accountType){
		userId = id;
		this.details = details; // sets the class variable to the params
		this.accountType = accountType;
	}
	
	public int getID(){
		return userId;
	}
	
	public void setID(int id){
		userId = id;
	}
	
	public String getDetails(){
		return details;
	}
	
	public void setDetails(String details){
		this.details = details;
	}
	
	public int getAccountType() { 
		return accountType;
	}
	
	public void setAccounType(int t) {
		 accountType = t;
	}
	
}
