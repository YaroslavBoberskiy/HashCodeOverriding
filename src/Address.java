import com.sun.prism.shader.DrawSemiRoundRect_ImagePattern_AlphaTest_Loader;

/**
 * Created by YB on 03.12.2015.
 */
public class Address {

    private String city;
    private String street;
    private int house;

    Address () {
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
