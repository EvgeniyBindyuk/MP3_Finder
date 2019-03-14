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

class SongInfo {

    void getInfo(File file) throws IOException {
        try (InputStream input = new FileInputStream(file)) {
            ContentHandler handler = new DefaultHandler();
            Metadata metadata = new Metadata();
            Parser parser = new Mp3Parser();
            ParseContext parseCtx = new ParseContext();
            parser.parse(input, handler, metadata, parseCtx);

            Utils.artist.put(Utils.count, metadata.get("xmpDM:artist"));
            Utils.genre.put(Utils.count, metadata.get("xmpDM:genre"));
            Utils.album.put(Utils.count, metadata.get("xmpDM:album"));
            Utils.year.put(Utils.count, metadata.get("xmpDM:releaseDate"));

            Utils.count++;
        } catch (TikaException | SAXException e) {
            e.printStackTrace();
        }
    }
}
