package cp213;

import java.io.PrintStream;

/**
 * Movie class definition.
 *
 * @author Ayaan Baig, baig9585@mylaurier.ca 169049585
 * @version 2025-01-05
 */
public class Movie implements Comparable<Movie> {

    // Constants
    /**
     * The first year movies were produced.
     */
    public static final int FIRST_YEAR = 1888;
    /**
     * The names of movie genres.
     */
    public static final String[] GENRES = { "science fiction", "fantasy", "drama", "romance", "comedy", "zombie",
	    "action", "historical", "horror", "war", "mystery" };
    /**
     * The maximum allowed Movie rating.
     */
    public static final double MAX_RATING = 10.0;
    /**
     * The minimum allowed Movie rating.
     */
    public static final double MIN_RATING = 0.0;

    /**
     * Creates a string of movie genres in the format:
     *
     * <pre>
     0: science fiction
     1: fantasy
     2: drama
    ...
    10: mystery
     * </pre>
     *
     * @return A formatted numbered string of Movie genres.
     */
    public static String genresMenu() {
	StringBuilder menu = new StringBuilder();
	for (int i = 0; i < GENRES.length; i++) {
	    menu.append(i).append(": ").append(GENRES[i]).append("\n");
	}
	return menu.toString();

	// your code here

    }

    // Attributes
    private String director = "";
    private int genre = -1;
    private double rating = 0;
    private String title = "";
    private int year = 0;

    /**
     * Instantiates a Movie object.
     *
     * @param title    Movie title.
     * @param year     Year of release.
     * @param director Name of director.
     * @param rating   Rating of 1 - 10 from IMDB.
     * @param genre    Number representing Movie genre.
     */
    public Movie(final String title, final int year, final String director, final double rating, final int genre) {
	this.title = title;
	this.year = year;
	this.director = director;
	this.rating = Math.max(MIN_RATING, Math.min(MAX_RATING, rating));
	this.genre = (genre >= 0 && genre < GENRES.length) ? genre : -1;

	// your code here

    }

    /**
     * Movies are compared by title, then by year if the titles match. Must ignore
     * case. Ex: Zulu, 1964 precedes Zulu, 2013. Returns:
     * <ul>
     * <li>0 if this equals target</li>
     * <li>&lt; 0 if this precedes target</li>
     * <li>&gt; 0 if this follows target</li>
     * </ul>
     */
    /*
     * (non-Javadoc)
     *
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(final Movie target) {
	int titleComparison = this.title.compareToIgnoreCase(target.title);
	return (titleComparison != 0) ? titleComparison : Integer.compare(this.year, target.year);

	// your code here

    }

    /**
     * Converts a genre integer to a string.
     *
     * @return The string version of the genre number.
     */
    public String genreToName() {
	return (genre >= 0 && genre < GENRES.length) ? GENRES[genre] : "Unknown";

	// your code here

    }

    /**
     * Director getter.
     *
     * @return The director.
     */
    public String getDirector() {
	return director;

	// your code here

    }

    /**
     * Genre getter.
     *
     * @return The genre number.
     */
    public int getGenre() {
	return genre;

	// your code here

    }

    /**
     * Rating getter.
     *
     * @return The rating.
     */
    public double getRating() {
	return rating;

	// your code here

    }

    /**
     * Title getter.
     *
     * @return The title.
     */
    public String getTitle() {
	return title;

	// your code here

    }

    /**
     * Year getter.
     *
     * @return The year.
     */
    public int getYear() {
	return year;

	// your code here

    }

    /**
     * Creates a formatted string of Movie key data in the format "title, year". Ex:
     * "Zulu, 1964".
     *
     * @return A Movie key as a string.
     */
    public String key() {
	return String.format("%s, %d", this.title, this.year);
    }

    /**
     * Rating setter.
     *
     * @param rating The new rating.
     */
    public void setRating(final double rating) {
	this.rating = Math.max(MIN_RATING, Math.min(MAX_RATING, rating));

    }

    /**
     * Returns a string in the format:
     *
     * <pre>
    Title:    title
    Year:     year
    Director: director
    Rating:   rating
    Genre:    genre
     * </pre>
     *
     */
    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString() Creates a formatted string of movie data.
     */
    @Override
    public String toString() {
	return String.format("Title:    %s\nYear:     %d\nDirector: %s\nRating:   %.1f\nGenre:    %s", title, year,
		director, rating, genreToName());

	// your code here

    }

    /**
     * Writes a single line of movie data to an open PrintStream in the format:
     * title|year|director|rating|genre
     *
     * @param ps Output PrintStream.
     */
    public void write(final PrintStream ps) {
	ps.printf("%s|%d|%s|%.1f|%d%n", title, year, director, rating, genre);

	// your code here

	return;
    }

}
