package com.ironhack.maventest.classes;

import java.util.Objects;

public class Country {
    private String name;
    private String capital;
    private long population;

    public Country(String name, String capital, long population) {
        this.name = name;
        this.capital = capital;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(getName(), country.getName()) && Objects.equals(getCapital(), country.getCapital());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCapital());
    }
}
