package entities;

public class Player extends User {

    public String playerName;
    private int playerId;
    public int playerXp;
    public int playerLvl;

    public int strength, intelligence, constitution, charisma ;

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
