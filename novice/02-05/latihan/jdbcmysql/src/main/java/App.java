import java.sql.*;

public class App {

    public static void main( String[] args ) throws SQLException {
        //create connection for a server installed in localhost
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/", "root", "rootlagi")) {
            // create a Statement
            try (Statement stmt = conn.createStatement()) {
                //execute query
                try (ResultSet rs = stmt.executeQuery("SELECT nick, address FROM praxis.fullstack4;")) {
                    //position result to first
                    int i = 1;
                    while (rs.next()) {
                        System.out.println(i+"\t"+rs.getString(1)+"\t"+rs.getString(2));
                        i++;
                    }
                    stmt.close();
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}