package day12.task4;

import day12.task5.MusicArtist;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> nameMembers;

    public MusicBand(String name, int year, List<String> nameMembers) {
        this.name = name;
        this.year = year;
        this.nameMembers = nameMembers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getNameMembers() {
        return nameMembers;
    }

    public void setNameMembers(List<String> nameMembers) {
        this.nameMembers = nameMembers;
    }

    public static void transferMembers(MusicBand a, MusicBand b) {
        for (String memmber : a.getNameMembers()) b.getNameMembers().add(memmber);
        a.getNameMembers().clear();
    }

    public void printMembers() {
        System.out.println(this.nameMembers);
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
