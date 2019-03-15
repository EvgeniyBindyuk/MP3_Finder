package by;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.parser.mp3.Mp3Parser;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.io.*;
import java.util.Objects;

class SongCreator {

    private Song getInfoFromFile(File file) throws IOException {
        try (InputStream input = new FileInputStream(file)) {
            ContentHandler handler = new DefaultHandler();
            Metadata metadata = new Metadata();
            Parser parser = new Mp3Parser();
            ParseContext parseCtx = new ParseContext();
            parser.parse(input, handler, metadata, parseCtx);

            return new Song(metadata.get("xmpDM:artist"),
                    metadata.get("title"),
                    metadata.get("xmpDM:album"),
                    metadata.get("xmpDM:genre"),
                    metadata.get("xmpDM:releaseDate"));

        } catch (TikaException | SAXException e) {
            e.printStackTrace();
        }
        return null;
    }

    void fillListSongs(String path, SongCreator creator, FilesInDirectory listFiles) {
        Utils.songList.clear();
        for (File file : Objects.requireNonNull(listFiles.getDir(path))) {
            try {
                Utils.songList.add(creator.getInfoFromFile(file));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Utils.printSongs();
    }
}
