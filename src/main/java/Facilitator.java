public class Facilitator {
    public void startGame(){
        System.out.println("【じゃんけんゲーム】");
        System.out.println("これより、じゃんけんゲームを開始します");
        System.out.println("勝負は１回、手はランダムに選ばれます");
    }

    public void endGame(){
        System.out.println("じゃんけんゲームを終了します");
    }

    public String getWinner(int playerInHand, int computerInHand){
        if (playerInHand == computerInHand){ //アイコの時
            return "draw";
        } else if((playerInHand == 0 && computerInHand == 1) || (playerInHand == 1 && computerInHand == 2) || (playerInHand == 2 && computerInHand == 0)){
            return  "player";
        } else {
            return "computer";
        }
    }

    public void showWinner(String playerName,String playerInHand, String computerInHand, String winner) {
        System.out.println(playerName + "さんとコンピュータとのじゃんけんを始めます");
        System.out.println(playerName + "さん：" + playerInHand + " VS コンピュータ：" + computerInHand);
        if (winner.equals("player")){
            System.out.println("勝者は、" + playerName + "さんです!!");
            System.out.println("おめでとうございます!!");
        }else if (winner.equals("computer")){
            System.out.println("残念！ 勝者は、コンピュータです");
        } else {
            System.out.println("残念！ 「あいこ」のため、引き分けです");
        }
    }

    public String changeIntToString(int hand){
        if (hand == 0){
            return "グー";
        } else if (hand == 1){
            return "チョキ";
        } else {
            return "パー";
        }
    }
}
