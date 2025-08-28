package Homework.Work_3;

public class GameSettings {
    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    // Конструктор
    GameSettings(String gameName) {
        this.gameName = gameName;
    }

    // Статический метод
    static void setMaxPlayers(int max) {
        maxPlayers = max;
    }

    //Метод
    void addPlayer() {
        if (currentPlayers < maxPlayers) {
            currentPlayers++;
        }
    }

    //Метод
    void printGameStatus() {
        System.out.println("Название: " + this.gameName + ", Текущее количество игроков: " + currentPlayers + ", Макс. количество игроков: " + maxPlayers);
    }
}
