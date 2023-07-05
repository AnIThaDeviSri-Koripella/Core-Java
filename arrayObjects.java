
class Student
{
    int rollno;
    String name;
    int marks;
}
public class arrayObjects 
{
    public static void main(String args[])
    {
        Student s1 = new Student();
        s1.rollno = 41;
        s1.name = "Anitha";
        s1.marks = 86;

        Student s2 = new Student();
        s2.rollno = 37;
        s2.name = "Priya";
        s2.marks = 69;

        Student s3 = new Student();
        s3.rollno = 23;
        s3.name = "vijaya";
        s3.marks = 83;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i=0;i<students.length;i++)
        {
            System.out.println(students[i].name + " - " +students[i].rollno +" : " +students[i].marks);
        }


    }
    
}
