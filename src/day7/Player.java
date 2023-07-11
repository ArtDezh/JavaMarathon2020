package day7;

public class Player {
    private int stamina;
    final int MAX_STAMINA = 100;
    final int MIN_STAMINA = 0;
    static int countPlayers = 0;

    public Player() {
        stamina = (int) (90 + Math.random() * 11);
        if (countPlayers < 6) countPlayers++;
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {
        stamina -= 1;
        if (stamina <= MIN_STAMINA) {
            countPlayers--;
            System.out.println("Количество играков на поле сейчас " + countPlayers);
        }
    }

    public static void info() {
        if (countPlayers < 6) {
            switch (countPlayers) {
                case 1:
                    System.out.println("Команды неполные. На поле еще есть " + (6 - Player.countPlayers) + " свободных мест.");
                    break;
                case 2,3,4:
                    System.out.println("Команды неполные. На поле еще есть " + (6 - Player.countPlayers) + " свободных места.");
                    break;
                case 5:
                    System.out.println("Команды неполные. На поле еще есть " + (6 - Player.countPlayers) + " свободное место.");
                    break;
            }
        } else System.out.println("На поле нет свободных мест.");
    }
}
