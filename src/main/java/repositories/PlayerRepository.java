package repositories;

import entities.Player;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PlayerRepository extends ConnectToDatabase {

    private ConnectToDatabase connectToDatabase;

     public void createPlayer(Player player){
         String sql = "insert into player (playerName, playerLvl, playerXp) values (?, 1, 0)";

         try(Connection connection = connectToDatabase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)){

             preparedStatement.setString(1, player.getPlayerName());

             preparedStatement.executeUpdate();
             System.out.println("player cadastrado");

         }catch (SQLException exception){
             exception.printStackTrace();
         }

     }


}
