package day12;

import day12.task5.MusicArtist;
import day12.task5.MusicBand;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Bob Marly", 40));
        members1.add(new MusicArtist("Lil Wayne", 33));
        members1.add(new MusicArtist("Drake Drake", 38));
        members1.add(new MusicArtist("Birdman Big", 41));
        members1.add(new MusicArtist("Guchi Gu", 35));
        members1.add(new MusicArtist("Mack Main", 29));

        MusicBand band1 = new MusicBand("Bad Band", 1999, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Jay Z", 36));
        members2.add(new MusicArtist("T I", 36));
        members2.add(new MusicArtist("The Game", 36));
        members2.add(new MusicArtist("Rick Ross", 36));

        MusicBand band2 = new MusicBand("Lu Gang", 2010, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();
    }
}
