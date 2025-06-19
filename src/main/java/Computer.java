public class Computer {
    //じゃんけんの手を表す定数
    public static final int STONE = 0;    //グー
    public static final int SCISSOR = 1;  //チョキ
    public static final int PAPER = 2;    //パー

    private int computerInHand;

    public int getComputerInHand(){
        return this.computerInHand;
    }

    public void setComputerInHand(){
        System.out.println("コンピュータの手をランダムに選びます");
        double random = Math.random() * 3;
        if (random <= 1){
            this.computerInHand = STONE;
        }else if (random > 1 && random <= 2){
            this.computerInHand = SCISSOR;
        }else {
            this.computerInHand = PAPER;
        }
    }
}
