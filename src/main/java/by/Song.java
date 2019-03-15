package by;

public class Song {

    Song(String artist, String song, String album, String genre, String year) {
        this.artist = artist;
        this.song = song;
        this.album = album;
        this.genre = genre;
        this.year = year;
    }

    private String artist;
    private String song;
    private String album;
    private String genre;
    private String year;

    String getArtist() {
        return artist;
    }

    String getSong() {
        return song;
    }

    String getAlbum() {
        return album;
    }

    String getGenre() {
        return genre;
    }

    String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return String.format("Artist: %-20s Song: %-40s Album: %-25s Genre: %-10s Year: %-10s",
                artist, song, album, genre, year);
    }
}
