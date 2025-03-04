package entities;

public class DailyQuest extends Quest{

    public boolean refreshQuest;

    public DailyQuest(String questName, String questDesc, int xpGained){
        super(questName, questDesc, xpGained);
        this.refreshQuest = true;
    }

    public void restartQuest(){
        questStatus = false;
    }

    public String toString(){
        return "\nnome da quest: " + questName
                + "\ndescricao: " + questDesc
                + "\nstatus da quest: " + questStatus
                + "\nxp ganho na quest: " + xpGained + " xp";
    }
}

