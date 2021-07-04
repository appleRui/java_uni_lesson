import javax.json.bind.annotation.JsonbProperty;

public class Score{
    @JsonbProperty(value ="subject")
    private String subject;
    @JsonbProperty(value="score")
    private int score;

    public Score(String subject, int score){
        this.subject = subject;
        this.score = score;
    }

    public Score(){}

    public String getSuject(){
        return this.subject;
    }

    public void setSuject(String subject){
        this.subject = subject;
    }

    public int getScore(){
        return this.score;
    }

    public void setScore(int score){
        this.score = score;
    }
}