package com.company;

public class OS {
    String name;
    String version;

    public OS(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    @Override
    public String toString() {
        String me = "OS Name: " + getName() + " " + "\n" +
                "OS Version: " + getVersion() + " " + "\n";
        return me;
    }
}
