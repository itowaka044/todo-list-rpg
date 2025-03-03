package entities;

public class DailyQuest extends Quest{

    public boolean refreshQuest;

    public DailyQuest(int questId, String questName, String questDesc, int xpGained, int playerId){
        super(questId, questName, questDesc, xpGained, playerId);
        this.refreshQuest = true;
    }

    public void restartQuest(){
        questStatus = false;
    }
}

