package entities;

public class Player extends User {

    public String playerName;
    private int playerId;
    public int playerXp;
    public int playerLvl;

    public int strength, intelligence, constitution, charisma ;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getCharisma() {
        return charisma;
    }

    public int getConstitution() {
        return constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getPlayerLvl() {
        return playerLvl;
    }

    public int getStrength() {
        return strength;
    }

    public Player(String playerName) {
        this.playerName = playerName;
        this.playerLvl = 1;
        this.playerXp = 1;
    }

    public boolean isNextLvl(){
        return playerXp >= playerLvl * 100;
    }

    public void LvlUp(int quantXp){
        if(!isNextLvl()) {
            playerXp += quantXp;

            System.out.println("\nganhou xp");
        } else {
            playerXp = playerXp - playerLvl * 100;
            playerLvl++;

            System.out.println("\nupou de lvl");
        }
    }

    public void changePlayerName(String actualName){
        playerName = actualName;

        System.out.println("\nnome atualizado");
    }

    public String toString(){
        return "\nnome: " + playerName
                + "\nlevel: " + playerLvl
                + "\nxp do player: " + playerXp;
    }
}
