package logic;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void putNewRecordsToXml(MovieList movieList){
        JaxbWriter jaxbWriter = new JaxbWriter();
        jaxbWriter.write(movieList, "My favorite movies.xml");
    }
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springApplicationContext.xml");
        MovieList movieList = new MovieList();
        movieList.addToMovieList(new Movie("I wish i were here", 2014, "Zakh Braff"));
        movieList.addToMovieList(new Movie("Garden state", 2004, "Zakh Braff"));
        putNewRecordsToXml(movieList);
//        context.close();
    }
}

