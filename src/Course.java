/**
 *
 * @author Aidan Glas
 */
public class Course
{
    private Code code;
    private int credits;

    public Course(Code co, int cr)
    {
        this.code = co;
        this.credits = cr;
    }
    
    public Course()
    {
        this.code = new Code();
        this.credits = 0;
    }

    @Override
    public String toString()
    {
        return "Course{" + "code=" + code + ", credits=" + credits + '}';
    }

    public Code getCode()
    {
        return code;
    }

    public void setCode(Code code)
    {
        this.code = code;
    }

    public int getCredits()
    {
        return credits;
    }

    public void setCredits(int credits)
    {
        this.credits = credits;
    }
    
    
}
