package Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class VacineDriver {

	public void vacine() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","abcd");
		Statement st=c.createStatement();
		//st.execute("INSERT INTO vacine(id,name,gender,phno,age) values(104,'hemadri','male',8142809517,21)");
		st.executeUpdate("update vacine set name='hema',phno=9550076366 where id=104");
		System.out.println("successfully executed");
		st.close();
		c.close();
		
	}
	public static void main(String[] args) throws Exception {
		VacineDriver v=new VacineDriver();
		v.vacine();
	}
	
	
}
