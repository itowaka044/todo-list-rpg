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


        DailyQuest quest1 = new DailyQuest(1,"correr", "correr rapido", 100, 3);


        System.out.println(quest1);

    }
}