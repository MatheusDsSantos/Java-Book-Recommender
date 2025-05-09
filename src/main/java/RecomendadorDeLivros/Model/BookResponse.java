package RecomendadorDeLivros.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class BookResponse {

    @JsonProperty("docs")
    private List<Book> books;

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public static class Book {
        private String title;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
