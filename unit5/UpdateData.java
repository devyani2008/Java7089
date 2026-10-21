
import java.sql.*;

class UpdateData
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

            String sql = "UPDATE student SET marks = 95 WHERE id = 1";

            int result = stmt.executeUpdate(sql);

            if(result > 0)
            {
                System.out.println("Data updated successfully.");
            }
            else
            {
                System.out.println("Record not found.");
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
