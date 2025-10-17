package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class holds the City type objects in a list
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This method adds a city object to the cities list
     * @param city
     *      This is a City object we want to add to the list
     * @throws IllegalArgumentException if the city already exists
     */
    public void add(City city){
        if(cities.contains(city))
            throw new IllegalArgumentException();
        cities.add(city);
    }

    /**
     * This method checks if a city object is in the cities list
     * @param city
     *      This is a City object we want to check for in the list
     * @return True if the city does exist, False if the city doesn't exist
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * This method deletes a city object from the cities list
     * @param city
     *      This is a City object we want to delete from the list
     * @throws IllegalArgumentException if the city doesn't exists
     */
    public void delete(City city){
        if(cities.contains(city))
            cities.remove(city);
        else throw new IllegalArgumentException();
    }

    /**
     * This method counts how many city objects in the cities list
     * @return the amount of cities in the list
     */
    public int countCities(){
        return cities.size();
    }

    /**
     * This method sorts the list of cities
     * @return a sorted list
     */
    public List<City> getCities(){
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }
}
