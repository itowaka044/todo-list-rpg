package entities;

public class SpecialQuest extends Quest{

    private int bonusXp;

    public SpecialQuest(int questId, String questName, String questDesc, int xpGained, int bonusXp) {
        super(questId, questName, questDesc, xpGained);
        this.bonusXp = bonusXp;
    }

    public void specialQuestRew(Player player){
        if (questStatus) {
            player.LvlUp(xpGained * (bonusXp / 100));
        }
    }

}
