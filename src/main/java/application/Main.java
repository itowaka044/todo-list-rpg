package application;

import entities.DailyQuest;
import entities.Player;
import entities.Quest;
import entities.SpecialQuest;
import repositories.QuestRepository;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        SpecialQuest quest1 = new SpecialQuest(1,"correr", "correr rapido", 100, 3, 3);


        Quest quest2 = new Quest(1,"correr", "correr rapido", 100, 3);


        System.out.println(quest1);

        Player player1 = new Player("joao");

        System.out.println(player1);

        quest2.questReward(player1);

        System.out.println(player1);



    }
}