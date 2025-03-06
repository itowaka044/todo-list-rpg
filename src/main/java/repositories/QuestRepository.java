package repositories;

import entities.Quest;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class QuestRepository extends ConnectToDatabase{

    private ConnectToDatabase connectToDatabase;

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

    public List<Quest> listQuests(){
        List<Quest> quests = new ArrayList<>();
        String sql = "select id, questName, questDesc, xpGained from quest";

        try(Connection connection = ConnectToDatabase.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql)){

            while (resultSet.next()){
                Quest quest = new Quest(resultSet.getInt("id"),
                        resultSet.getString("questName"),
                        resultSet.getString("questDesc"),
                        resultSet.getInt("xpGained"));
                quests.add(quest);
            }

        } catch (SQLException exception){
            exception.printStackTrace();
        }

        return quests;
    }
}
