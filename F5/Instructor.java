public class Instructor{
    private String id;
    private String name;

    public Instructor(){}

    public Instructor(String id, String name){
        this.id = id;
        this.name = name;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}