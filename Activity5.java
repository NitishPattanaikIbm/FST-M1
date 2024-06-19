package activities;

abstract class Book {
    String title;

    // Abstract method to set the title
    abstract void setTitle(String s);

    // Concrete method to get the title
    String getTitle() {
        return title;
    }
}

public class Activity5 extends Book {

    // Implement the abstract method setTitle
    @Override
    void setTitle(String s) {
        title = s;
    }

    public static void main(String[] args) {
        // Create an object of MyBook
        Activity5 newNovel = new Activity5();

        // Set the title of the book
        newNovel.setTitle("The Great Gatsby");

        // Get and print the title of the book
        System.out.println("The title of the book is: " + newNovel.getTitle());
    }
}