import java.sql.*;

public class Main {

    public static void main(String[] args) {

        String url= "jdbc:mysql://Localhost:3306/sqlbasic";

        String user ="root";
        String password= "[<Yuran140521>]";

       String student_name = "Select  nome  from estudante where estudante_id=1" ; // SQL queries to be  executed


        try {
            Connection connection= DriverManager.getConnection(url, user, password);// Creating te connection between the database and the application
            System.out.println("Connected");

            Statement statement=connection.prepareStatement(student_name);
            ResultSet reult = statement.executeQuery(student_name);
            reult.next();
                String name= reult.getString("nome");
                System.out.println(name);


        }
        catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }

    }
}
