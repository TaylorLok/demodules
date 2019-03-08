public class RestaurantService
{
    private String FoodType;
    private String Drinks;
    private String Coffees;

    public RestaurantService()
    {

    }

    public String getFoodType()
    {
        return FoodType;
    }

    public void setFoodType(String foodType)
    {
        FoodType = foodType;
    }

    public String getDrinks()
    {
        return Drinks;
    }

    public void setDrinks(String drinks)
    {
        Drinks = drinks;
    }

    public String getCoffees()
    {
        return Coffees;
    }

    public void setCoffees(String coffees)
    {
        Coffees = coffees;
    }

    @Override
    public String toString() {
        return "RestaurantService{" +
                "FoodType='" + FoodType + '\'' +
                ", Drinks='" + Drinks + '\'' +
                ", Coffees='" + Coffees + '\'' +
                '}';
    }
}
