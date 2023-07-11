package day12;

import day12.task3.MusicBand;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand mb1 = new MusicBand("Beatlz", 1995);
        MusicBand mb2 = new MusicBand("RocNRoll", 2004);
        MusicBand mb3 = new MusicBand("Shakira", 1990);
        MusicBand mb4 = new MusicBand("Bitzz", 2010);
        MusicBand mb5 = new MusicBand("BadGuys", 2020);
        MusicBand mb6 = new MusicBand("Lollipop", 2011);
        MusicBand mb7 = new MusicBand("PussyCatDolls", 1999);
        MusicBand mb8 = new MusicBand("Ramstein", 1989);
        MusicBand mb9 = new MusicBand("Buaty", 2007);
        MusicBand mb10 = new MusicBand("Shadura", 2016);

        List<MusicBand> list = new ArrayList<>();

        list.add(mb2);
        list.add(mb4);
        list.add(mb6);
        list.add(mb8);
        list.add(mb10);
        list.add(mb1);
        list.add(mb3);
        list.add(mb5);
        list.add(mb7);
        list.add(mb9);

        System.out.println(list);
        System.out.println("--------------------------------");
        System.out.println(groupsAfter2000(list));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> after2000 = new ArrayList<>();
        for (MusicBand x : bands) if (x.getYear() > 2000) after2000.add(x);
        return after2000;
    }
}
