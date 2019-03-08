import java.util.Objects;

public class RestEmployees
{
    private String EmpName;
    private int EmpNumber;
    private String EmpOrder;

    public RestEmployees()
    {

    }

    public String getEmpName()
    {
        return EmpName;
    }

    public void setEmpName(String empName)
    {
        EmpName = empName;
    }

    public int getEmpNumber()
    {
        return EmpNumber;
    }

    public void setEmpNumber(int empNumber)
    {
        EmpNumber = empNumber;
    }

    public String getEmpOrder()
    {
        return EmpOrder;
    }

    public void setEmpOrder(String empOrder)
    {
        EmpOrder = empOrder;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RestEmployees that = (RestEmployees) o;
        return EmpNumber == that.EmpNumber;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(EmpNumber);
    }

    @Override
    public String toString()
    {
        return "RestEmployees{" +
                "EmpName='" + EmpName + '\'' +
                ", EmpNumber=" + EmpNumber +
                ", EmpOrder='" + EmpOrder + '\'' +
                '}';
    }

}
