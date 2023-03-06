public class Student{
    int score;
    String id;
    String name;
    String className;

    public Student(int score, String id, String name, String className){
        this.score = score;
        this.id = id;
        this.name = name;
        this.className = className;
    }

    public int getScore(){
        return score;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getClassName(){
        return className;
    }
}
