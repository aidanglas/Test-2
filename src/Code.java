/**
 *
 * @author Aidan Glas
 */
public class Code
{
    private String major;
    private int number;

    public Code(String m, int n)
    {
        this.major = m;
        this.number = n;
    }
    
    public Code()
    {
        this.major = " ";
        this.number = 0;
    }

    @Override
    public String toString()
    {
        return "Code{" + "major=" + major + ", number=" + number + '}';
    }

    public String getMajor()
    {
        return major;
    }

    public void setMajor(String major)
    {
        this.major = major;
    }

    public int getNumber()
    {
        return number;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }
    
    
}
