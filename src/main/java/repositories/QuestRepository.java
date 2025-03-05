package repositories;

import entities.Quest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class QuestRepository {

    public void saveQuest(Quest quest){
        String sql = "insert into quest (questName, questDesc, xpGained) values (?, ?, ?)";

        try(Connection connection = ConnectToDatabase.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql)){

            statement.setString(1, quest.getQuestName());
            statement.setString(2, quest.getQuestDesc());
            statement.setInt(3, quest.getXpGained());

            statement.executeUpdate();
            System.out.println("quest salva");

        } catch (SQLException exception){
            exception.printStackTrace();
        }
    }
}
