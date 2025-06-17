import java.util.*;

public class Player {
    //じゃんけんの手を表す定数
    public static final int STONE = 0;    //グー
    public static final int SCISSOR = 1;  //チョキ
    public static final int PAPER = 2;    //パー

    private int playerInHand;
    private String playerName;

    public int getPlayerInHand(){
        return this.playerInHand;
    }

    public String getPlayerName(){
        return this.playerName;
    }

    public void setPlayerName(){
        System.out.println("プレイヤー名前を入力して下さい。");
        this.playerName = new Scanner(System.in).nextLine();
    }

    public void setPlayerInHand(){
        System.out.println("プレイヤーの手をランダムに選びます");
        double random = Math.random() * 3;
        if (random <= 1){
            this.playerInHand = STONE;
        }else if (random > 1 && random <= 2){
            this.playerInHand = SCISSOR;
        }else {
            this.playerInHand = PAPER;
        }
    }
}
