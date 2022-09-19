 /*import java.util.ArrayList;

public class Library <T>{
    private ArrayList<T> mediaCollection = new ArrayList<T>();

    public Library(){
        Book b = new Book();
        storeMedia();
        Video v = new Video();
        storeMedia(v);
        Newspaper n = new Newspaper();
        storeMedia(n);
        showMedia();
    }
    public void showMedia(){
        System.out.println("these items are in the media collection: ");
        for(Object resource : mediaCollection.toArray()){
            System.out.println("\t" + resource.toString() + "\n");
        }
    }

    public void storeMedia(T item) {
        mediaCollection.add(item);
    }
}

class Book implements Media{
    String type = "book";
    String name = "Robison Curuso";

    public Book(){
        System.out.println(this.getClass());
    }

    public String toString(){
        return "type is" + type + ", name is: " + name;
    }
}

class Video implements Media {
    String type = "Video";
    String name = "Elvis Pressley in the Army";

    public String toString(){
        return "type is" + type + ", name is: " + name;
    }
}

class Newspaper {
    String type = "newspaper";
    String name = "News & Disturber";

    public String toString(){
        return "type is" + type + ", name is: " + name;
    }
}

interface Media{
    // String type;


    public static void main(String[] args) {
        Library<Media> lib  = new Library<Media>();
    }
}



/* import java.util.ArrayList;
import java.util.List;

public class Library {
    private List resources = new ArrayList();
    public void addMedia(Media x) {
        resources.add(x);
    }
    public Media retrieveLast(){
        int  size = resources.size();
        if(size > 0){
            return (Media)resources.get(size - 1);
        }
        return null;
    }
}

interface Media {
}
interface Book extends Media {

}
interface Video extends Media {

}
interface Newspaper extends Media {

}

 */