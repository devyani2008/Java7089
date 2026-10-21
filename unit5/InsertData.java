
import java.sql.*;

class InsertData
{
    public static void main(String args[])
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe",
                "system",
                "password"
            );

            Statement stmt = con.createStatement();

            String sql = "INSERT INTO student VALUES (1, 'Rahul', 85)";

            int result = stmt.executeUpdate(sql);

            if(result > 0)
            {
                System.out.println("Data inserted successfully.");
            }

            stmt.close();
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
