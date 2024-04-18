package com.example.sl_herbs;

public class herbs {
    private int id;
    private String name;
    private String scientificName;
    private String description;

    public herbs(int id, String name, String scientificName, String description) {
        this.id = id;
        this.name = name;
        this.scientificName = scientificName;
        this.description = description;
    }

    @Override
    public String toString() {
        return "herbs{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", scientificName='" + scientificName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScientificName() {

        return scientificName;
    }

    public void setScientificName(String scientificName) {

        this.scientificName = scientificName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
