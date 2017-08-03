package filmweb;

import java.util.HashMap;
import java.util.Map;

public class Movie {

	String title;
	Director director;
	int time;
	int grade;
	Category category;
	Map<String, Actor> actors = new HashMap<String, Actor>();
}
