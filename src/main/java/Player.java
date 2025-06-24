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
        System.out.println("プレイヤー名をキーボードで入力して下さい");
        this.playerName = new Scanner(System.in).nextLine();
    }

    public void setPlayerInHand(String playerName){
        System.out.println(playerName + "さんの手を選んでください");
        System.out.println("「グー」を選ぶ場合は、数字の「1」を入力してください");
        System.out.println("「チョキ」を選ぶ場合は、数字の「2」を入力してください");
        System.out.println("「パー」を選ぶ場合は、数字の「3」を入力してください");
        System.out.println("それ以外の数字は入力できません");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (scanner.hasNextInt()) {
                 int number = scanner.nextInt();
                if (number == 1) {
                    System.out.println(playerName + "さんは「グー」を選びました");
                    this.playerInHand = STONE;
                    break;
                } else if (number == 2) {
                    System.out.println(playerName + "さんは「チョキ」を選びました");
                    this.playerInHand = SCISSOR;
                    break;
                } else if(number == 3) {
                    System.out.println(playerName + "さんは「パー」を選びました");
                    this.playerInHand = PAPER;
                    break;
                } else {
                    System.out.println("入力エラー: 「1」,「2」,「3」のどれかを入力してください");
                }
            } else {
                System.out.println("エラー: 「1」,「2」,「3」のどれかを入力してください");
                scanner.next();
            }
        }
        scanner.close();
    }
}
