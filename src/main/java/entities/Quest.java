package entities;

public class Quest{

    public int questId;
    public String questName;
    public String questDesc;
    public int xpGained;
    public boolean questStatus;
    public int questValue;

    public Quest() {
    }

    public Quest(int questId, String questName, String questDesc, int xpGained, int questValue) {
        this.questId = questId;
        this.questName = questName;
        this.questDesc = questDesc;
        this.xpGained = xpGained;
        this.questValue = questValue;
    }

    public int getQuestId() {
        return questId;
    }

    public void setQuestId(int questId) {
        this.questId = questId;
    }

    public String getQuestName() {
        return questName;
    }

    public void setQuestName(String questName) {
        this.questName = questName;
    }

    public String getQuestDesc() {
        return questDesc;
    }

    public void setQuestDesc(String questDesc) {
        this.questDesc = questDesc;
    }

    public int getXpGained() {
        return xpGained;
    }

    public void questReward(Player player){
        if (!questStatus) {
            System.out.println("\nquest completa");
            player.playerXp += xpGained;
            if (player.isNextLvl()){
                player.LvlUp(xpGained);
                questStatus = true;
            }
        } else {
            System.out.println("\nquest ja foi feita");
        }
    }

    public String toString(){
        return "\nnome da quest: " + questName
                + "\ndescricao: " + questDesc
                + "\nstatus da quest: " + questStatus
                + "\nxp da quest: " + xpGained + " xp";
    }
}