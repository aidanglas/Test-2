/**
 *
 * @author Aidan Glas
 */
public class app
{
    public static void main(String[] args)
    {
        ProgrammingCourse pc1 = new ProgrammingCourse();
        System.out.println(pc1.toString());
        
        Code c1 = new Code("IST", 240);
        ProgrammingCourse pc2 = new ProgrammingCourse("java", false, c1, 3);
        System.out.println(pc2.toString());
    }
    
}
