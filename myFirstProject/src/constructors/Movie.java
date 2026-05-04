package constructors;

public class Movie {
	String movie;
	String director;
	String actor;
	String actress;
	double budget;
	Movie() {
		System.out.println("No arg constructor called");
	}
	Movie(String movie) {
		this.movie = movie;
	}
	Movie(Movie m3, String actress, double budget) {
		this.movie = m3.movie;
		this.director = m3.director;
		this.actor = m3.actor;
		this.actress = actress;
		this.budget = budget;
	}
	Movie(Movie m2, String director, String actor) {
		this.movie = m2.movie;
		this.director = director;
		this.actor = actor;
	}
	public static void main(String[] args) {
		Movie m1 = new Movie();
		m1.display();
		Movie m2 = new Movie("RRR");
		m2.display();
		Movie m3 = new Movie(m2, "Rajamouli", "Mahesh Babu");
		m3.display();
		Movie m4 = new Movie(m3, "Alia Bhatt", 5000000000.00);
		m4.display();
	}
	void display() {
		System.out.println("**************************");
		System.out.println("Movie Name: " + movie);
		System.out.println("Director Name: " + director);
		System.out.println("Actor: " + actor);
		System.out.println("Actress Name: " + actress);
		System.out.println("Budget: " + budget);
	}
}
