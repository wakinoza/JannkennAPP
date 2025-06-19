
public class Main {
    public static void main(String[] args) {
        Player p = new Player();
        Computer c = new Computer();
        Facilitator f = new Facilitator();

        f.startGame();
        p.setPlayerName();
        String playerName = p.getPlayerName();

        p.setPlayerInHand();
        c.setComputerInHand();

        int playerInHand = p.getPlayerInHand();
        int computerInHand = c.getComputerInHand();

        String Winner = f.getWinner(playerInHand,computerInHand);
        String playerInHandString = f.changeIntToString(playerInHand);
        String computerInHandString = f.changeIntToString(computerInHand);

        f.showWinner(playerName, playerInHandString, computerInHandString,Winner);

        f.endGame();


    }
}
