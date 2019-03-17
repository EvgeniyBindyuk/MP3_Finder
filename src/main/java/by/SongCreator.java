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

class SongCreator {

    Song createSongFromMeta(File song) throws IOException {
        try (InputStream input = new FileInputStream(song)) {
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


}
