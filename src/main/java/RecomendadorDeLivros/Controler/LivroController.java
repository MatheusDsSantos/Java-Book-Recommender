package RecomendadorDeLivros.Controler;

import RecomendadorDeLivros.Service.BookService;
import RecomendadorDeLivros.Service.Livro;
import RecomendadorDeLivros.Service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LivroController {
    @Autowired
    private LivroService livroService;
    @Autowired
    private BookService bookService;

    @GetMapping("/lista")
    public List<Livro> getLivros(){

        return livroService.listarLivros();
    }

    @PostMapping("/incluir_livro")
    public String incluirLivro(@RequestBody Livro livro) {
        livroService.adicionarLivro(livro);
        return "Livro adicionado com sucesso!";
    }

    @GetMapping("/busca_livros")
    public List<String> buscaLivros(@RequestParam String nome_livro){
        return bookService.searchBooks(nome_livro);
    }

    @GetMapping("/sobre")
    public String getIntegrantes(){
        return  """
                [
                    {"nome": "Matheus Henrique"},
                    {"nome": "Bianca Fernandes"}
                   \s
                ]
              \s""";

    }
}


