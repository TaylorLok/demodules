public class RestaurantOwner
{
    private String RestOwner;
    private String RestName;
    private String RestTel;

    public RestaurantOwner()
    {

    }


    public String getRestOwner()
    {
        return RestOwner;
    }

    public void setRestOwner(String restOwner)
    {
        RestOwner = restOwner;
    }

    public String getRestName()
    {
        return RestName;
    }

    public void setRestName(String restName)
    {
        RestName = restName;
    }

    public String getRestTel()
    {
        return RestTel;
    }

    public void setRestTel(String restTel)
    {
        RestTel = restTel;
    }


    @Override
    public String toString()
    {
        return "RestaurantOwner{" +
                "RestOwner='" + RestOwner + '\'' +
                ", RestName='" + RestName + '\'' +
                ", RestTel='" + RestTel + '\'' +
                '}';
    }
}
