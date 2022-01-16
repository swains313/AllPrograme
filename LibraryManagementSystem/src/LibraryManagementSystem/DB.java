package LibraryManagementSystem;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
// Notice, do not import com.mysql.cj.jdbc.*
// or you will have problems!
public class DB {
	public static Connection getConnection(){
		Connection con=null;

        try {
            // The newInstance() call is a work around for some
            // broken Java implementations
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarymanagementdatabase","root","saumyasql");
        } catch (Exception e) {System.out.println(e);}
        
            // handle the error
        return con;
        
    }
}
