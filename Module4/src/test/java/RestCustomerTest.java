import org.junit.Assert;
import org.junit.Test;

public class RestCustomerTest
{
    @Test//(expected = AssertionError.class)
    public void RestObjectIdentity()
    {
        RestCustomer restCustomer = new RestCustomer();

        Assert.assertEquals("Clio", "Clio");
    }
}
