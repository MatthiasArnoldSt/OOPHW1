/*2. In order to be included in a national ranking exercise, secondary schools may choose to participate in a math competency
evaluation survey. The MoE maintains the list of the schools (there may be new addition, and some schools may opt out).

Each school is identified by its name, the address (this is usually split into multiple parts),
and the principal's name (first name, last name). A dataset of marks collected for each school.

Each marks entry consists of a score, the ID, and name and class name of the participating student.

The survey is carried out on a yearly basis.

The MoE would like to be able to do the following calculation over the years :
-get the score for a particular school in a particular year
-list out the average score for each school
-list out the standard deviation for each school
-sort the list
*/
import java.util.*;

public class Main {
    private static List<School> schools; //list to store all school objects

    public Main(List<School> schools) {
        this.schools = schools;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //adding schools
        System.out.println("Please enter the school's name: ");
        String name = in.nextLine();

        System.out.println("Please enter the year: ");
        int year = in.nextInt();
        in.nextLine();

        System.out.println("Please enter the school's address information: ");
        System.out.println("Please enter the school's road name: ");
        String road = in.nextLine();
        System.out.println("Please enter the school's district name: ");
        String district = in.nextLine();
        System.out.println("Please enter the school's state name: ");
        String state = in.nextLine();

        Address address = new Address(road, district, state);


        System.out.println("Please enter the school's principal name: ");
        System.out.println("Please enter their first name: ");
        String fname = in.nextLine();
        System.out.println("Please enter their last name: ");
        String lname = in.nextLine();

        PName principalName = new PName(fname, lname);

        School SMKKalaka = new School(name, year, address, principalName);

        schools.add(SMKKalaka);

        //printing out marks entries
        System.out.println("Marks entries: ");
        List<Student> marklist = SMKKalaka.getMarksEntries();
        for (Student student : marklist) {
            System.out.println("Name:" + student.getName() + "\n Score - " + student.getScore() + "\n ID num: - " + student.getId() + "\n Class Name: " + student.getClassName());


            double avg = SMKKalaka.calculateAverageScore();
            double stdDev = SMKKalaka.calculateStandardDeviation();

            System.out.println("Average score: " + avg);
            System.out.println("Standard deviation: " + stdDev);
        }

    }
}
