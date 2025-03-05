package application;

import entities.DailyQuest;
import entities.Player;
import entities.Quest;
import repositories.QuestRepository;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Quest quest = new Quest("correr", "ficar rapido", 200);

        QuestRepository questRepository = new QuestRepository();

        questRepository.saveQuest(quest);

    }
}