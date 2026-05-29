public class Subject {
    private String subjcetName;
    private int score;

    public Subject(String subjcetName, int score) {
        this.subjcetName = subjcetName;
        this.score = score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}
