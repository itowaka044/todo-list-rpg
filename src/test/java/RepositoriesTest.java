import entities.Player;
import entities.Quest;
import org.junit.jupiter.api.Test;
import repositories.ConnectToDatabase;
import repositories.PlayerRepository;
import repositories.QuestRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class RepositoriesTest {

    @Test
    void saveQuestTest(){

        Quest quest = new Quest("correr", "ficar rapido", 200);

        QuestRepository questRepository = new QuestRepository();

        questRepository.saveQuest(quest);

    }

    @Test
    void listQuestsTest(){

        QuestRepository questRepository = new QuestRepository();

        List<Quest> quests = questRepository.listQuests();

        for(Quest s : quests){
            System.out.println(s);
        }
    }

    @Test
    void createPlayerTest(){

        Player player = new Player("joao");

        PlayerRepository playerRepository = new PlayerRepository();

        playerRepository.createPlayer(player);
    }

}
