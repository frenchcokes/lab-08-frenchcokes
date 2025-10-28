package com.example.lab08;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    private CustomList customList;

    @BeforeEach
    public void setup() {
        customList = new CustomList();
    }

    @Test
    public void testHasCity() {
        City city = getMockCity();

        customList.addCity(city);

        assertTrue(customList.hasCity(city));
    }

    @Test
    public void testDeleteCity() {
        City city = getMockCity();

        customList.deleteCity(city);

        assertFalse(customList.hasCity(city));
    }

    @Test
    public void testCountCities() {
        City city1 = getMockCity();
        City city2 = new City("Calgary", "Alberta");

        customList.addCity(city1);

        assertEquals(customList.countCities(), 1);

        customList.addCity(city2);

        assertEquals(customList.countCities(), 2);

        customList.deleteCity(city1);

        assertEquals(customList.countCities(), 1);
    }

    private City getMockCity() {
        return new City("Edmonton", "Alberta");
    }
}
