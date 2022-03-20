package day12.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> musicBandList = new ArrayList<>(Arrays.asList(new MusicBand("Abba", 1972), new MusicBand("AC/DC", 1973),
                new MusicBand("Linkin Park", 1996), new MusicBand("My Chemical Romance", 2001), new MusicBand("Metallica", 1981),
                new MusicBand("ВИА Гра", 2006), new MusicBand("Coldplay", 1996), new MusicBand("Rammstein", 1994),
                new MusicBand("HIM", 1991), new MusicBand("U2", 1976), new MusicBand("FIFTH HARMONY", 2012)));

        Collections.shuffle(musicBandList);
        System.out.println(musicBandList);

        System.out.println(groupsAfter2000(musicBandList));

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> after2000MusicBands = new ArrayList<>();
        for (MusicBand band: bands) {
            if (band.getYear() > 2000)
                after2000MusicBands.add(band);
        }
        return after2000MusicBands;
    }
}
