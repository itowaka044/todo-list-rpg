package entities;

public class DailyQuest extends Quest{

    public boolean refreshQuest;

    public DailyQuest(boolean refreshQuest) {
        this.refreshQuest = refreshQuest;
    }

    public DailyQuest(int questId, String questName, String questDesc, int xpGained, int questValue) {
        super(questId, questName, questDesc, xpGained, questValue);
        this.refreshQuest = true;
    }

    public void restartQuest(){
        questStatus = false;
    }

    @Override
    public String toString(){

        String status;

        if(!refreshQuest) {
            status = "sim";
        }else{
            status = "nao";
        }

        return "\nnome da quest: " + questName
                + "\ndescricao: " + questDesc
                + "\nstatus da quest: " + questStatus
                + "\nxp da quest: " + xpGained + " xp"
                + "\nja foi feita: " + status;
    }
}

