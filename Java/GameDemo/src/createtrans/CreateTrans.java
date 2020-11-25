package createtrans;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CreateTrans {
    public static void main(String[] args) {
        try {
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        
            try (Connection con = DriverManager.getConnection("jdbc:sqlserver://sqlserver01; databaseName = "
            + "Library; user = user1; password = password#1234");)
            {
                con.setAutoCommit(false);
                
                try (PreparedStatement ps = con.prepareStatement("INSERT INTO Publishers (pub_id, pub_name) Values (?, ?)");)
                {
                    ps.setString(1, "P006");
                    ps.setString(2, "Darwin Press");
                    int firstctr = ps.executeUpdate();
                    System.out.println("First Row Inserted but not committed");
                    
                    try (PreparedStatement ps2 = con.prepareStatement("INSERT INTO Publishers(pub_id, pub_name)Values(?, ?)");)
                    {
                        ps2.setString(1, "P007");
                        ps2.setString(2, "MainStream Publishing");
                        int secondctr = ps2.executeUpdate();
                        System.out.println("Second Row Inserted but not committed");
                        
                        con.commit();
                        System.out.println("Transaction Committed, Please check table for data");
                    }
                } 
            } 
        }
        catch (Exception e) {
            System.err.println("Error : " + e);
        }
    }
}
