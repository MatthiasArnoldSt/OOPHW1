import java.util.*;
public class School{
    String name;
    int year;
    Address address;
    PName principalName;
    List<Student> marklist; //creating a list

    public School(String name, int year, Address address, PName principalName){
        this.name = name;
        this.year = year;
        this.address = address;
        this.principalName = principalName;
        marklist = new ArrayList<>();
    }


    public String getName(){
        return name;
    }

    public int getYear(){
        return year;
    }

    public Address getAddress(){
        return address;
    }

    public PName getPrincipalName(){
        return principalName;
    }

    public void  addMarksEntry(Student markList){
        marklist.add(markList);
    }

    public List<Student> getMarksEntries(){
        return marklist;
    }

    public double calculateAverageScore(){
        double sum = 0.0;
        for (Student marks : marklist){
            sum += marks.getScore();
        }
        return sum / marklist.size();
    }

    public double calculateStandardDeviation() {
        double avg = calculateAverageScore();
        double sum = 0.0;
        for (Student student : marklist) {
            sum += Math.pow(student.getScore() - avg, 2);
        }
        return Math.sqrt(sum /marklist.size());
    }
}
