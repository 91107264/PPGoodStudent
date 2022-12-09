public class Student
{
    private String firstName;
    private String lastName;
    private int id;
    private float gpa;
    private boolean csStudent;

    public Student(String theFirstName, String theLastName, int Theid, float Thegpa, boolean iscsstudent)
    {
        firstName = theFirstName;
        lastName = theLastName;
        id = Theid;
        gpa = Thegpa;
        csStudent = iscsstudent;
    }

    public void setFirstName(String name)
    {
        firstName = name;
    }
    public void setLastName(String name)
    {
        lastName = name;
    }
    public void setID(int id1)
    {
        id = id1;
    }
    public void setGPA(float thegpa)
    {
        gpa = thegpa;
    }
    public void setCSStudent(boolean isStudent)
    {
        csStudent = isStudent;
    }

    public Student()
    {
        firstName = "first name goes here";
        lastName = "last name goes here";
        id = 00000000;
        gpa = 0;
        csStudent = false;
    }
    public String createID()
    {
        return firstName.substring(0,1) + lastName + (id / 1000);
    }

    public Float CSGPA()
    {
        if(csStudent==true)
        {
            return (gpa * 1.15f);
        }
        return gpa;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getID()
    {
        return id;
    }

    public float getGPA()
    {
        return gpa;
    }

    public boolean getCSStudent()
    {
        return csStudent;
    }

    public String toString()
    {
        String output = "First Name: " + firstName +
                "\nLast Name: " + lastName +
                "\nID number: " + id +
                "\nGPA: " + gpa +
                "\nThe Student is in computer science: " + csStudent;
        return output;
    }
}//End student class
