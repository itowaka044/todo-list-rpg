package entities;

public class Quest{

    public int questId;
    public String questName;
    public String questDesc;
    public int xpGained;
    public boolean questStatus;
    public boolean questValue;
    public int playerId;

    public Quest(int questId, String questName, String questDesc, int xpGained, int playerId) {
        this.questId = questId;
        this.questName = questName;
        this.questDesc = questDesc;
        this.xpGained = xpGained;
        this.playerId = playerId;
    }

    public Quest(int questId, String questName, String questDesc, int xpGained, boolean questStatus, boolean questValue) {
        this.questId = questId;
        this.questName = questName;
        this.questDesc = questDesc;
        this.xpGained = xpGained;
        this.questStatus = questStatus;
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
        if (questStatus) {
            player.gainXp(xpGained);
        }
    }
}
