package application;

import entities.DailyQuest;
import entities.Player;
import entities.Quest;
import repositories.QuestRepository;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Quest quest = new Quest("correr", "ficar rapido", 200);

        QuestRepository questRepository = new QuestRepository();

        questRepository.saveQuest(quest);

        List<Quest> quests = questRepository.showAllQuests();

        for(Quest s : quests){
            System.out.println(s);
        }

    }
}