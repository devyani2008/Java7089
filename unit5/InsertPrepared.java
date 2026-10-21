
import java.sql.*;

class InsertPrepared
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

            String sql = "INSERT INTO student VALUES (?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, 3);
            ps.setString(2, "Amit");
            ps.setInt(3, 88);

            int result = ps.executeUpdate();

            if(result > 0)
            {
                System.out.println("Record inserted successfully.");
            }

            ps.close();
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
