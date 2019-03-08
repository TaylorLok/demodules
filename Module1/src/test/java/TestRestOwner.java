import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestRestOwner
{

    @Before
    public void Setup() throws Exception
    {
        RestaurantOwner restO = new RestaurantOwner();


        Assert.assertEquals("Name","CellPhone number");
    }


    @After
    public void tearDown() throws Exception
    {

    }

    @Test

    public void TestOwner()
    {
        Assert.assertNotSame("Taylor","Nceba","cyfo");
    }
}
