import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import javax.annotation.processing.Filer;
import java.awt.print.Book;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class readJsonTest {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader("book.json")) {
            Object obj = parser.parse(reader);
            JSONObject book = (JSONObject) obj;
            System.out.println(book);
            System.out.println(book.get("Book"));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}