
public class Main {
    public static void main(String[] args) {
        Player p = new Player();
        Computer c = new Computer();
        Facilitator f = new Facilitator();

        try {
            f.startGame();
            Thread.sleep(2000);

            p.setPlayerName();
            String playerName = p.getPlayerName();
            Thread.sleep(2000);

            p.setPlayerInHand(playerName);
            Thread.sleep(2000);
            c.setComputerInHand();
            Thread.sleep(2000);

            int playerInHand = p.getPlayerInHand();
            int computerInHand = c.getComputerInHand();

            String Winner = f.getWinner(playerInHand,computerInHand);
            String playerInHandString = f.changeIntToString(playerInHand);
            String computerInHandString = f.changeIntToString(computerInHand);

            f.showWinner(playerName, playerInHandString, computerInHandString,Winner);
            Thread.sleep(3000);

            f.endGame();
        } catch (InterruptedException e) {
            System.out.println("例外が発生しました");
            System.out.println("プログラムを終了します");
        }


    }
}
