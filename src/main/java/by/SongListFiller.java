package by;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

class SongListFiller {
    private SongCreator songCreator = new SongCreator();
    private SongsFromDir dir = new SongsFromDir();

    void fillListSong(String path) {
        SongList.songList.clear();
        for (File file : Objects.requireNonNull(dir.getListSong(path))) {
            try {
                Song song = songCreator.createSongFromMeta(file);
                SongList.songList.add(song);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
