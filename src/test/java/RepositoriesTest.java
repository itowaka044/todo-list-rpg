import entities.Player;
import entities.Quest;
import org.junit.jupiter.api.Test;
import repositories.PlayerRepository;
import repositories.QuestRepository;

import java.util.List;

public class RepositoriesTest {

    @Test
    void saveQuestTest(){

        Quest quest = new Quest(1, "correr", "ficar rapido", 200, 1);

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
