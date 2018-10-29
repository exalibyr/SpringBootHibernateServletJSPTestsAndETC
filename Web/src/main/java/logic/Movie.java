package logic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Movie")
@XmlAccessorType(XmlAccessType.FIELD)

public class Movie {
    @XmlElement(name="Name")
    private String name;
    @XmlElement(name="YearOfRelease")
    private int year;
    @XmlElement(name="Director")
    private String director;

    public Movie(String name, int year, String director) {
        this.name = name;
        this.year = year;
        this.director = director;
    }

    Movie(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Movie{");
        sb.append("Name='").append(name).append('\'');
        sb.append(", Year of release=").append(year);
        sb.append(", Director=").append(director);
        sb.append('}');
        return sb.toString();
    }
}
