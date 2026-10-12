package Oct12Metoder;

public class Player {

    private int score;

    public int  getScore()
    {
        return score;
    }

    public  void setScore(int score)
    {
        this.score = score;

    }

    public static void main(String[] args) {
        Player player1 = new Player();
        player1.setScore(50);
        int scoreValue = player1.getScore();
        System.out.println("The score is : " + scoreValue);
    }
}
