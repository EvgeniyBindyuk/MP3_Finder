package by;

import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FilesInDirectory listFiles = new FilesInDirectory();
        String consoleInput;
        SongCreator songCreator = new SongCreator();
        while (!(consoleInput = scanner.nextLine()).equals("end")) {
            switch (consoleInput) {
                case "artist":
                    Utils.songList.sort(Comparator.comparing(Song::getArtist));
                    Utils.printSongs();
                    break;
                case "song":
                    Utils.songList.sort(Comparator.comparing(Song::getSong));
                    Utils.printSongs();
                    break;
                case "year":
                    Utils.songList.sort(Comparator.comparing(Song::getYear));
                    Utils.printSongs();
                    break;
                case "album":
                    Utils.songList.sort(Comparator.comparing(Song::getAlbum));
                    Utils.printSongs();
                    break;
                case "genre":
                    Utils.songList.sort(Comparator.comparing(Song::getGenre));
                    Utils.printSongs();
                    break;
                default:
                    songCreator.fillListSongs(consoleInput, songCreator, listFiles);
                    break;
            }

        }
    }
}
