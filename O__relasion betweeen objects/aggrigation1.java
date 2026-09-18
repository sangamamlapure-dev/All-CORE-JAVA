class Player {
    String name;

    Player(String name) {
        this.name = name;
    }
}

class Team {
    Player player;

    Team(Player player) {
        this.player = player;
    }

    void display() {
        System.out.println("Team has player: " + player.name);
    }
}

public class Main {
    public static void main(String[] args) {
        Player p = new Player("Virat");

        Team t = new Team(p);
        t.display();
    }
}