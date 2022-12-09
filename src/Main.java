public class Main
{
    public static void main(String[] args)
    {
        Student Alan = new Student("Alan", "Turing", 191254, 3.56f, true);
        Student Florance = new Student("Florance", "Nightingale", 182010, 3.89f, false);
        Student Grace = new Student("Grace", "Hopper", 190692, 3.99f, true);
        System.out.println(Alan.toString());
        System.out.println();
        Florance.setID(95366);
        Florance.setGPA(3.92f);
        System.out.println("Florance's ID: " + Florance.getID());
        System.out.println("Florance's GPA: " + Florance.getGPA());
        System.out.println("Graces's first name: " + Grace.getFirstName());
        System.out.println("Grace is a cs student: " + Grace.getCSStudent());
        System.out.println(Alan.createID());
        System.out.println(Florance.createID());
        System.out.println(Grace.createID());
        System.out.println(Alan.CSGPA());
        System.out.println(Florance.CSGPA());
        System.out.println(Grace.CSGPA());
    }//End main
}//End main class
