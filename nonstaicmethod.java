package Firstpackege;

public class nonstaicmethod {

	void Login()
	{
		System.out.println("Login to Amazon");
	}
	
	void Logout()
	{
		System.out.println("Logout from Amazon");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		nonstaicmethod a1= new nonstaicmethod();
		a1.Login();
		a1.Logout();

	}

}
