# Minha Lista de Leitura com Recomendação 📚

## Descrição

Este projeto fornece uma API simples para gerenciar uma lista de leitura. A API permite obter informações sobre os integrantes do projeto, listar livros cadastrados, buscar livros na OpenLibrary e adicionar novos livros à lista.

---

## Rotas da API

### `GET /get/sobre`

Retorna os integrantes responsáveis pela criação do projeto.

**Exemplo de resposta:**

```json
[
    {"nome": "Matheus Henrique"}
]
```

---

### `GET /get/lista`

Retorna todos os livros cadastrados na lista de leitura.

**Exemplo de resposta:**

```json
[
    {"titulo": "1984", "autor": "George Orwell"},
    {"titulo": "O Conto da Aia", "autor": "Margaret Atwood"}
]
```

---

### `GET /get/busca_livro?titulo=nome`

Busca livros na OpenLibrary com base no título informado.

**Exemplo de resposta:**

```json
[
    {"titulo": "2030", "autor": "James Bridge", "sinopse": "Um futuro onde o governo vigia todos."},
    {"titulo": "2024: A Revolução", "autor": "Ana Silva", "sinopse": "Mudanças sociais e políticas drásticas."}
]
```

---

### `POST /post/incluir_livro`

Adiciona um novo livro à lista de leitura.

**Formato da requisição:**

```json
{
    "titulo": "2030",
    "sinopse": "Um futuro onde o governo vigia todos."
}
```

**Exemplo de resposta:**

```json
{
    "mensagem": "Livro adicionado com sucesso!"
}
```

---

## Tecnologias Utilizadas

* Java com Spring Boot
* OpenLibrary API para buscas externas
* JSON para formatação dos dados


## Contribuidores

* Matheus Henrique
* Bianca Fernandes
