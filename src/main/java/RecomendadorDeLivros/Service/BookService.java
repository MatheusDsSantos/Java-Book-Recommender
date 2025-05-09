package RecomendadorDeLivros.Service;

import RecomendadorDeLivros.Model.BookResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {

    private final RestTemplate restTemplate;

    @Autowired
    public BookService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<String> searchBooks(String query) {
        // URL da API  oopenLibrary
        String url = "https://openlibrary.org/search.json?q=" + query;

        // requisição GET e obtendo a resposta como BookResponse
        BookResponse response = restTemplate.getForObject(url, BookResponse.class);

        // Retornando os 10 primeiros livros com apenas o título
        if (response != null && response.getBooks() != null) {
            return response.getBooks().stream()
                    .limit(10)
                    .map(BookResponse.Book::getTitle)  // Pa
                    .collect(Collectors.toList());
        }

        return List.of();
    }
}
