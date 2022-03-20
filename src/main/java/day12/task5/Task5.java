package day12.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicBand> musicBandList = new ArrayList<>();
        MusicBand band1 = new MusicBand("Abba", 1972, new ArrayList<>(Arrays.asList(new MusicArtist("Agnetha Fältskog",25), new MusicArtist("Björn Ulvaeus", 27),new MusicArtist("Benny Andersson", 30), new MusicArtist("Anni-Frid Lyngstad",20))));
        MusicBand band2 = new MusicBand("Linkin Park", 1996, new ArrayList<>(Arrays.asList(new MusicArtist("Mike Shinoda",20), new MusicArtist("Chester Bennington",21), new MusicArtist(" Joe Hahn",23))));
        MusicBand band3 = new MusicBand("My Chemical Romance", 2001, new ArrayList<>(Arrays.asList(new MusicArtist("Ray Toro",18), new MusicArtist("Gerard Way",19))));
        MusicBand band4 = new MusicBand("U2", 1976, new ArrayList<>(Arrays.asList(new MusicArtist("Bono",33), new MusicArtist("The Edge",30), new MusicArtist("Adam Clayton",27), new MusicArtist("Larry Mullen Jr.",25))));
        MusicBand band5 = new MusicBand("Metallica", 1981, new ArrayList<>(Arrays.asList(new MusicArtist("James Hetfield",33), new MusicArtist("Kirk Hammett",34), new MusicArtist("Lars Ulrich",32), new MusicArtist("Robert Trujillo",35))));

        band5.printMembers(band5.getMembers());

        MusicBand.transferMembers(band5, band2);

        band5.printMembers(band5.getMembers());
        band2.printMembers(band2.getMembers());
    }
}
