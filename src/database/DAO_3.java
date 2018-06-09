package database;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DAO_3 {
	public static void setCredentials(String username, String password) {
			
            Connection con1 = DBConnection.getConnection();
            try {

                String insert = "INSERT INTO projectDatabase.SignUp VALUES(?,?)";

                PreparedStatement ps1 = con1.prepareStatement(insert);

                ps1.setString(1, username);
                ps1.setString(2, password);

                ps1.executeUpdate();
                
            } catch (Exception e1) {

                e1.printStackTrace();
            }
	}
}