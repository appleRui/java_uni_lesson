import java.util.ArrayList;
import java.util.List;
import javax.json.bind.annotation.JsonbProperty;

public class Enrollee{
    @JsonbProperty(value="id")
    private String id;
    @JsonbProperty(value="name")
    private String name;
    @JsonbProperty(value="scores")
    private List<Score> scores = new ArrayList<Score>();

    public Enrollee(){}

    public Enrollee(String id, String name){
        this.id = id;
        this.name = name;
    }

    public List<Score> getScores(){
        return this.scores;
    }

    public void setScores(List<Score> scores){
        this.scores = scores;
    }

    public void add(Score score){
        this.scores.add(score);
    }

    public Score get(int number){
        return this.scores.get(number);
    }


    public String getId(){
        return this.id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

}