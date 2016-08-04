package movies;

import java.util.ArrayList;

public class Movies {

	private String title;
	private String category;
	private String compareCategory;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public Movies(String title, String category) {
		super();
		this.title = title;
		this.category = category;
	}
	
	
	
	/*public void addToArrayList () {
		ArrayList<String> movies = new ArrayList();
		movies.add(getTitle());
	}*/
	
	/*public Movies (String title, String category){
		
		setTitle(title);
		setCategory(category);
	}
	*/
}
