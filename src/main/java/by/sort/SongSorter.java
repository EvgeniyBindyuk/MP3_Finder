package by.sort;

import by.Song;
import by.SongList;

import java.util.Comparator;

public class SongSorter {
    public static void sortBy(String rule) {
        switch (rule) {
            case "artist":
                SongList.songList.sort(Comparator.comparing(Song::getArtist));
                break;
            case "song":
                SongList.songList.sort(Comparator.comparing(Song::getSong));
                break;
            case "year":
                SongList.songList.sort(Comparator.comparing(Song::getYear));
                break;
            case "album":
                SongList.songList.sort(Comparator.comparing(Song::getAlbum));
                break;
            case "genre":
                SongList.songList.sort(Comparator.comparing(Song::getGenre));
                break;
            default:
                System.out.println("Invalid sorting rule");
                break;
        }
    }
}
