import entities.DailyQuest;
import entities.Player;
import entities.Quest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EntitiesTest {

    @Test
    void createPlayer(){

        Player[] player = new Player[10];

        player[0] = new Player("joao");

        System.out.println(player[0]);

    }

    @Test
    void createQuest(){

        Quest[] quest = new Quest[10];

        quest[0] = new Quest(1, "estudar", "aprender...", 100, 1);

        System.out.println(quest[0]);

    }

    @Test
    void resetXP(){

        Quest quest = new Quest(1, "estudar", "aprender...", 100, 1);

        Player player = new Player("joao");

        quest.questReward(player);

        assertEquals(1, player.playerXp);

        System.out.println(player);

    }

    @Test
    void createDailyQuest(){

        Quest quest = new DailyQuest(1,"malhar", "ficar forte", 50,1);

        Player player = new Player("joao");

        System.out.println(quest);

        quest.questReward(player);

        System.out.println("daily quest completa");

    }
}
