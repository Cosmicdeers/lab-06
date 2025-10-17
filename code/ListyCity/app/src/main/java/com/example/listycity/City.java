package com.example.listycity;

/**
 * This class represents a City
 */
public class City implements Comparable{
    private String city;
    private String province;
    City(String city, String province){
        this.city = city;
        this.province = province;
    }
    String getCity(){
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    String getProvince(){
        return this.province;
    }

    public void setProvince(String province) {
        this.province = province;
    }



    /**
     * This methods compares City objects based on their city name field.
     * @param o the object to be compared.
     * @return 0, <1 or >1 if two values are equal a<b or a>b
     */
    @Override
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCity()); // this.city refers to the city name
    }
}

