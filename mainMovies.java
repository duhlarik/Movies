package movies;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class mainMovies {

	public static void main(String[] args) {

		ArrayList<Movies> movies = new ArrayList();

		movies.add(new Movies("Inside Out", "animated"));
		movies.add(new Movies("Harry Potter", "fantasy"));
		movies.add(new Movies("The Lord of the Rings", "fantasy"));
		movies.add(new Movies("Bruce Almighty", "comedy"));
		movies.add(new Movies("Avatar", "scifi"));
		movies.add(new Movies("The Avengers", "scifi"));
		movies.add(new Movies("The Secret Life of Pets", "animated"));
		movies.add(new Movies("Silver Linings Playbook", "comedy"));
		movies.add(new Movies("Concussion", "drama"));
		movies.add(new Movies("The Revenant", "drama"));

		// sort movie categories
		sortedCategories(movies);

		printSortedCategories(movies);
/*
		System.out.println("These are the categories. ");
		for (int i = 0; i < movies.size(); i++) {
			System.out.println(movies.get(i).getCategory());
		}*/

		String choice = "yes";
		while (choice.equalsIgnoreCase("yes")) {

			System.out.println("What category do you want to look at?");
			Scanner scan1 = new Scanner(System.in);
			String input = scan1.nextLine();

			for (int j = 0; j < movies.size(); j++) {
				if (input.equalsIgnoreCase(movies.get(j).getCategory())) {

					System.out.println(movies.get(j).getTitle());
				}
			}

			System.out.println("Do you want to look at another category?");

			choice = scan1.nextLine();

			if (choice.equalsIgnoreCase("no")) {
				System.out.println("Goobye!");
			}
		}
	}

	public static void printSortedCategories(ArrayList<Movies> movies) {
		for (int j = 0; j < movies.size(); j++) {
			if (j < movies.size() - 1) {
				if (!(movies.get(j).getCategory().equalsIgnoreCase(movies.get(j + 1).getCategory()))) {
					System.out.println(movies.get(j).getCategory());
				}
			}

		}
		System.out.println(movies.get(movies.size() - 1).getCategory());
	}

	public static void sortedCategories(ArrayList<Movies> movies) {
		Collections.sort(movies, new Comparator<Movies>() {
			public int compare(Movies movie1, Movies movie2) {
				return movie1.getCategory().compareTo(movie2.getCategory());
			}
		});
	}
}
