package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<MusicBand> musicBandList = new ArrayList<>();
        MusicBand band1 = new MusicBand("Abba", 1972, new ArrayList<>(Arrays.asList("Agnetha Fältskog", "Björn Ulvaeus", "Benny Andersson", "Anni-Frid Lyngstad")));
        MusicBand band2 = new MusicBand("Linkin Park", 1996, new ArrayList<>(Arrays.asList("Mike Shinoda", "Chester Bennington", " Joe Hahn")));
        MusicBand band3 = new MusicBand("My Chemical Romance", 2001, new ArrayList<>(Arrays.asList("Ray Toro", "Gerard Way")));
        MusicBand band4 = new MusicBand("U2", 1976, new ArrayList<>(Arrays.asList("Bono", "The Edge", "Adam Clayton", "Larry Mullen Jr.")));
        MusicBand band5 = new MusicBand("Metallica", 1981, new ArrayList<>(Arrays.asList("James Hetfield", "Kirk Hammett", "Lars Ulrich", "Robert Trujillo")));

        band5.printMembers(band5.getMembers());

        MusicBand.transferMembers(band5, band2);

        band5.printMembers(band5.getMembers());
        band2.printMembers(band2.getMembers());

    }
}
