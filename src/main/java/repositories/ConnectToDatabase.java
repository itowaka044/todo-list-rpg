package repositories;

import java.sql.*;

public class ConnectToDatabase {

    private static final String url = "jdbc:mysql://localhost:3306/todolist";
    private static final String user = "root";
    private static final String password = "1234";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    public void createStatementConn(String sql) throws SQLException {
        Connection connection = ConnectToDatabase.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
    }

    public void prepareStatementConn(String sql) throws SQLException{
        Connection connection = ConnectToDatabase.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
    }

}
