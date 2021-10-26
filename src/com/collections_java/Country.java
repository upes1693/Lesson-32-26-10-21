package com.collections_java;

public class Country implements Comparable<Country> {
    private int code;
    private String name;

    public Country(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Country c) {
        return this.name.compareTo(c.name);
    }
}
