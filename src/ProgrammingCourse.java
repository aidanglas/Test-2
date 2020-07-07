/**
 *
 * @author Aidan Glas
 */
public class ProgrammingCourse extends Course
{
    private String language;
    private Boolean advanced;

    public ProgrammingCourse(String l, Boolean a, Code code, int credits)
    {
        super(code, credits);
        this.language = l;
        this.advanced = a;
    }

    public ProgrammingCourse()
    {
        this.language = " ";
        this.advanced = false;
    }

    @Override
    public String toString()
    {
        return super.toString() + "ProgrammingCourse{" + "language=" + language + ", advanced=" + advanced + '}';
    }
    
    
}
