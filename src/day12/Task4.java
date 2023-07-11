package day12;

import day12.task4.MusicBand;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Bob Marly");
        members1.add("Lil Wayne");
        members1.add("Drake Drake");
        members1.add("Birdman Big");
        members1.add("Guchi Gu");
        members1.add("Mack Main");

        MusicBand band1 = new MusicBand("Bad Band", 1999, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("Jay Z");
        members2.add("T I");
        members2.add("The Game");
        members2.add("Rick Ross");

        MusicBand band2 = new MusicBand("Lu Gang", 2010, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();

    }
}
