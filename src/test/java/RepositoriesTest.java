import entities.Quest;
import org.junit.jupiter.api.Test;
import repositories.QuestRepository;

public class RepositoriesTest {

    @Test
    void saveQuestToDB(){

        Quest quest = new Quest("correr", "ficar rapido", 200);

        QuestRepository questRepository;

    }
}
