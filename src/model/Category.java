package model  ;

public class Category extends Main_category {
    String genre;

    public Category(String sitting_arrangement, String genre) {
        super(sitting_arrangement);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
