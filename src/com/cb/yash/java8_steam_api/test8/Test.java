package com.cb.yash.java8_steam_api.test8;

import java.util.Random;

public class Test {
    static String[] games = { "COD","Prince Of Persia", "GTA-V5", "Valorant", "FIFA 22", "Fortnite" };
    static String[] tracks= { "Believer", "Cradles", "india", "Sorry", "i love india" };

    public static void main(String[] args) {

        RandomPlayer player = new RandomPlayer(); // Instance of
        Random random = new Random();

        Runnable gameRunner = () ->  {
            try {
                player.playGame(games[random.nextInt(games.length)]);
            }
            catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        };

        Runnable musicPlayer = () -> {
            try {
                player.playMusic(tracks[random.nextInt(tracks.length)]);
            }
            catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        };

        Thread game = new Thread(gameRunner);
        Thread music = new Thread(musicPlayer);

        // Starting two different threads
        game.start();
        music.start();

    }
}
