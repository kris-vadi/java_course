package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", members=" + members +
                '}';
    }

    public void printMembers(List<MusicArtist> members) {
        System.out.println();
        for (MusicArtist member: members)
            System.out.println(member);
    }

    public static void transferMembers (MusicBand a, MusicBand b) {
        for (MusicArtist member: a.getMembers())
            b.getMembers().add(member);
        a.getMembers().clear();
    }
}
