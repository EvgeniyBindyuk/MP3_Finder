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

    public String getArtist() {
        return artist;
    }

    public String getSong() {
        return song;
    }

    public String getAlbum() {
        return album;
    }

    public String getGenre() {
        return genre;
    }

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return String.format("Artist: %-15s Song: %-45s Album: %-25s Genre: %-10s Year: %-10s",
                artist, song, album, genre, year);
    }
}
