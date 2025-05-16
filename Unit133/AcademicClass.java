import java.util.*;
public class AcademicClass
{
    private Teacher teacher;
    private ArrayList<Student> students;
    public AcademicClass(Teacher teacher)
    {
        this.teacher = teacher;
        this.students = new ArrayList<>();

    }
    public void addStudent(Student student)
    {
        students.add(student);
    }
    public void printClassInfo()
    {
        System.out.println("Teacher: " + teacher.getName() + " (Subject: " + teacher.getSubject() + ")");
        System.out.println("Students:");
        for (Student student : students)
        {
            System.out.println("-" + student.getName());
        }
    }
    public ArrayList<String> studentsWithFavoriteNumber(int n)
    {
        ArrayList<String> matchingStudents = new ArrayList<>();
        for (Student student : students)
        {
            if (student.getFavoriteNumber() == n)
            {
                matchingStudents.add(student.getName());
            }
        }
        return matchingStudents;
    }
    public ArrayList<String> studentsWithOddFavoriteNumber()
    {
        ArrayList<String> oddFavorites = new ArrayList<>();
        for (Student student : students)
        {
            if (student.getFavoriteNumber() % 2 != 0)
            {
                oddFavorites.add(student.getName());
            }
        }
        return oddFavorites;
    }
    
    public static void main(String[] args)
    {
        Teacher teacher = new Teacher("Ms. Johnson", "History");
        AcademicClass historyClass = new AcademicClass(teacher);
        historyClass.addStudent(new Student("Alice", 7));
        historyClass.addStudent(new Student("Bob", 4));
        historyClass.addStudent(new Student("Charlie", 7));
        historyClass.addStudent(new Student("Daisy", 9));
        historyClass.printClassInfo();
        System.out.println("Students whose favorite number is 7:");
        for (String name : historyClass.studentsWithFavoriteNumber(7)) 
        {
            System.out.println("- " + name);
        }
         System.out.println("Students with odd favorite numbers:");
        for (String name : historyClass.studentsWithOddFavoriteNumber()) 
        {
            System.out.println("- " + name);
        }
}
}
    