class Student1
{
    int rollno;
    String name;
    int marks;
}

public class enhanced2 
{
    public static void main(String args[])
    {
        int nums[] = {2,3,4,5};
        for(int n : nums)
        {
            System.out.println(n);
        }
        Student1 s1 = new Student1();
        s1.rollno = 41;
        s1.name = "Anitha";
        s1.marks = 86;
        Student1 s2 = new Student1();
        s2.rollno = 37;
        s2.name = "Priya";
        s2.marks = 69;
        Student1 s3 = new Student1();
        s3.rollno = 23;
        s3.name = "Vijaya";
        s3.marks = 83;
        Student1 students[] = {s1,s2,s3};
        for(Student1 stud : students)
        {
            System.out.println(stud.name+" : "+stud.marks);
        }
    }
    
}
