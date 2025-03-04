package application;

import entities.DailyQuest;
import entities.Player;
import entities.Quest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("insira o nome do jogador:");
        String playerName = scn.nextLine();

        Player[] player = new Player[10];

        player[0] = new Player(playerName);

        System.out.println(player[0]);
        System.out.println();

        System.out.println("-----------");

        System.out.println("crie uma quest");
        System.out.println("nome da quest:");
        String questName = scn.nextLine();

        System.out.println("insira uma descrição:");
        String desc = scn.nextLine();

        System.out.println("insira quanto de xp vc vai ganhar: ");
        int xpGained = scn.nextInt();

        Quest[] quest = new Quest[10];

        quest[0] = new Quest(questName, desc, xpGained);

        System.out.println(quest[0]);

        System.out.println("------------------");

        quest[0].questReward(player[0]);

        System.out.println(player[0]);

        System.out.println("-------------------");

        scn.nextLine();

        System.out.println("crie uma daily quest");
        System.out.println("insira o nome: ");
        questName = scn.nextLine();

        System.out.println("insira uma descrição:");
        desc = scn.nextLine();

        System.out.println("insira quanto de xp vc vai ganhar: ");
        xpGained = scn.nextInt();

        quest[1] = new DailyQuest(questName, desc, xpGained);

        System.out.println(quest[1]);

        System.out.println("daily quest completada");

        quest[1].questReward(player[0]);

        System.out.println(player[0]);

        scn.close();

    }
}