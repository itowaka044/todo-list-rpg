package entities;

public class SpecialQuest extends Quest{

    private int xpMultiplier;

    public SpecialQuest(int xpMultiplier) {
        this.xpMultiplier = xpMultiplier;
    }

    public SpecialQuest(int questId, String questName, String questDesc, int xpGained, int questValue, int xpMultiplier) {
        super(questId, questName, questDesc, xpGained, questValue);
        this.xpMultiplier = xpMultiplier;
    }

    @Override
    public void questReward(Player player){

        xpGained *= xpMultiplier;

        super.questReward(player);

    }

    @Override
    public String toString(){
        return "\nnome da quest: " + questName
                + "\ndescricao: " + questDesc
                + "\nstatus da quest: " + questStatus
                + "\nxp da quest: " + xpGained + " xp"
                + "\nmultiplicador de xp: " + xpMultiplier;
    }

}
