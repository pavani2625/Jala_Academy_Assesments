import java.sql.SQLException;

public class Program18_SQLException {

    public static void main(String[] args) {

        try {

            throw new SQLException("SQL Exception occurred");

        } catch (SQLException e) {

            System.out.println(e.getMessage());
        }
    }
}