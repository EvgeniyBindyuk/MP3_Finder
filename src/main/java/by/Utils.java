package by;

import java.util.ArrayList;

class Utils {
    static ArrayList<Song> songList = new ArrayList<>();

    static void printSongs() {
        for (Song song : songList) {
            System.out.println(song);
        }
    }
}
