class Laptops
{
    int price;
    String model;

    public String toString()  //initiating toString method (so object calls this method instead of object class default toString()method)
    {
        return "HEY";
    }
    public boolean equals(Laptops that)
    {
        return this.model.equals(that.model) && this.price == that.price;
    }

    // @Override
    // public int hashCode() {
    //     final int prime = 31;
    //     int result = 1;
    //     result = prime * result + price;
    //     result = prime * result + ((model == null) ? 0 : model.hashCode());
    //     return result;
    // }

    // @Override
    // public boolean equals(Object obj) {
    //     if (this == obj)
    //         return true;
    //     if (obj == null)
    //         return false;
    //     if (getClass() != obj.getClass())
    //         return false;
    //     Laptops other = (Laptops) obj;
    //     if (price != other.price)
    //         return false;
    //     if (model == null) {
    //         if (other.model != null)
    //             return false;
    //     } else if (!model.equals(other.model))
    //         return false;
    //     return true;
    // }

    

}

public class Objects 
{
    public static void main(String args[])
    {
        Laptops obj1 = new Laptops();
        obj1.model="Poco M2";
        obj1.price= 1001;

        Laptops obj2 = new Laptops();
        obj2.model="Poco M2";
        obj2.price= 1000;

        boolean result = obj1.equals(obj2);

        System.out.println(result);
        System.out.println(obj1); 
        System.out.println(obj2);
        //when you print the object it calls the toString method of object class even if we don't mention.
    }
    
}
