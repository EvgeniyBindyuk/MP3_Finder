package by;

class Printer {
    void printSongs() {
        for (Song song : SongList.songList) {
            System.out.println(song);
        }
    }
}
