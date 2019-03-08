public class RestCustomer
{
    private String CustName;
    private String CustOrder;


    public RestCustomer()
    {

    }

    public String getCustName()
    {
        return CustName;
    }

    public void setCustName(String custName)
    {
        CustName = custName;
    }

    public String getCustOrder()
    {
        return CustOrder;
    }

    public void setCustOrder(String custOrder)
    {
        CustOrder = custOrder;
    }


    @Override
    public String toString()
    {
        return "RestCustomer{" +
                "CustName='" + CustName + '\'' +
                ", CustOrder='" + CustOrder + '\'' +
                '}';
    }


}
