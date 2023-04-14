import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class writeJsonTest {
    public static void main(String[] args) {
        JSONObject Book = new JSONObject();
        JSONArray bookDetail= new JSONArray();
        JSONObject book4 = new JSONObject();
        book4.put("id","A104");
        book4.put("name","Dummies");
        book4.put("price","$30");
        book4.put("author","Jon Nash");

        JSONObject book1 = new JSONObject();
        book1.put("id","A102");
        book1.put("name","Dummies and ME");
        book1.put("price","$40");
        book1.put("author","Michael");

        JSONObject book2 = new JSONObject();
        book2.put("id","A102");
        book2.put("name","Red Fox");
        book2.put("price","$10");
        book2.put("author","Jack niclo");

        JSONObject book3 = new JSONObject();
        book3.put("id","A103");
        book3.put("name","No Way To Run");
        book3.put("price","$15");
        book3.put("author","John Wayne");

        bookDetail.add(book1);
        bookDetail.add(book2);
        bookDetail.add(book3);
        bookDetail.add(book4);

        Book.put("Book",bookDetail);


        try(FileWriter file =new FileWriter("book.json")){
            file.write(Book.toString());
            file.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Book);
    }

}
