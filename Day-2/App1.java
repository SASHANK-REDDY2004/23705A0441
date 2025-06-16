public class App1 {
	public static void main(String args[]) {
		App a1=new App("Facebook","Social",1000,new String[] {"Good","Moderate","best","super","Excellent"});
		a1.getSummary();
	}
}



class App {
	String name;
	String category;
	int downloads;
	String[] reviews;
	App(String name,String category,int downloads,String[] reviews) {
		this.name=name;
		this.category=category;
		this.downloads=downloads;
		this.reviews=reviews;
	}
	int popularity() {
		if(downloads>900) return 1;
		else if(downloads>700) return 2;
		else return 3;
	}
	void getReviews() {
		for(int i=0; i<reviews.length; i++) {
			System.out.println(reviews[i]);
		}
	}
	void getSummary() {
		System.out.println("Name of the application is:"+name);
		System.out.println("Category of the application is:"+category);
		System.out.println("Number of downloads of the application is:"+downloads);
		System.out.println("Reviews for the application:");
		getReviews();

	}
}