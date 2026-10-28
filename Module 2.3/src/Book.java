import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private double rating;
    private ArrayList<String> reviews = new ArrayList<>();
    private String name;
    private int age;



    public Book(String title, String author, int publicationYear){
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;

    }

    public String getTitle(){
        return title;

    }
    public String getAuthor(){
        return author;
    }
    public int getPublicationYear(){
        return publicationYear;
    }

    public void setRating(double rating){
        this.rating = rating;
    }

    public void addReview(String review){
        reviews.add(review);
    }
    public double getRating(){
        return rating;
    }

    public ArrayList<String> getReviews() {
        return reviews;
    }
}


