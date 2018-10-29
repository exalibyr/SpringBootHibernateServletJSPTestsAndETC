package logic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name="Movies")
@XmlAccessorType(XmlAccessType.FIELD)
public class MovieList {


    @XmlElement(name="Movie")
    private List<Movie> movieList = new ArrayList<>();

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void addToMovieList(Movie movie) {
        this.movieList.add(movie);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MovieList{");
        sb.append("Movies=").append(movieList);
        sb.append('}');
        return sb.toString();
    }
}
