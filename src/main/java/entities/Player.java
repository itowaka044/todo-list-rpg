package entities;

public class Player extends User {

    public String playerName;
    private int playerId;
    public int playerXp;
    public int playerLvl;
    public int nextLvl = playerLvl * 100;

    public int strength, intelligence, constitution, charisma ;

    public void gainXp(int quantXp){
        if(!isNextLvl()) {
            playerXp += quantXp;

            System.out.println("ganhou xp");
        } else {
            playerLvl++;
            playerXp = nextLvl - playerXp;

            System.out.println("upou de lvl");
        }
    }

    public boolean isNextLvl(){
        return playerXp >= nextLvl;
    }

    public void changePlayerName(String actualName){
        playerName = actualName;

        System.out.println("nome atualizado");
    }
}
