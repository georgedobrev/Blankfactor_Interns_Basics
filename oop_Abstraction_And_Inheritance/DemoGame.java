package oop_Abstraction_And_Inheritance;

import java.util.Random;
import java.util.Scanner;

public class DemoGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter Hero name: ");
        String heroName = scanner.nextLine();

        int heroHealth = 100;
        int heroStrength = random.nextInt(6) + 5;
        int heroExperience = random.nextInt(6) + 5;
        int heroLevel = random.nextInt(6) + 5;;

        Hero hero = new Hero(heroName, heroHealth, heroStrength, heroExperience, heroLevel);

        System.out.println("\nHero created:");
        System.out.println(hero);

        boolean gameEnded = false;

        while (!gameEnded) {
            System.out.println("\n====== New Battle ======");

            System.out.print("Enter Enemy name: ");
            String enemyName = scanner.nextLine();

            System.out.print("Enter Enemy health: ");
            int enemyHealth = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Enemy strength: ");
            int enemyStrength = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Enemy level: ");
            int enemyLevel = scanner.nextInt();
            scanner.nextLine();

            Enemy enemy = new Enemy(enemyName, enemyHealth, enemyStrength, enemyLevel);

            System.out.println("\nEnemy created:");
            System.out.println(enemy);

            boolean battleEnded = false;

            while (!battleEnded) {
                // Hero attacks first
                hero.attack(enemy);
                System.out.println(hero.getName() + " attacked " + enemy.getName() + "!");

                if (enemy.getHealth() <= 0) {
                    //Enemy defeated
                    System.out.println(enemy.getName() + " defeated!");
                    battleEnded = true;
                    hero.setExperience(hero.getExperience() + enemy.getLevel() * 10);
                    System.out.println(hero.getName() + " gained " + enemy.getLevel() * 10 + " experience points.");
                } else {
                    //Enemy counterattacks
                    enemy.attack(hero);
                    System.out.println(enemy.getName() + " counterattacked " + hero.getName() + "!");

                    if (hero.getHealth() <= 0) {
                        //Hero defeated
                        System.out.println(hero.getName() + " defeated!");
                        battleEnded = true;
                        gameEnded = true;
                        System.out.println("Game over!");
                    }
                }
            }

            if (!gameEnded) {
                System.out.print("Continue playing? (y/n): ");
                String choice = scanner.nextLine();

                if (choice.equalsIgnoreCase("n")) {
                    gameEnded = true;
                    System.out.println("Game over!");
                }
            }
        }
    }
}
