package edu.greenriver.sdev.projectundervcs.controllers;

import edu.greenriver.sdev.projectundervcs.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController
{
    private List<Book> booksList = List.of(
        new Book("The Sword of Destiny", "Andrzej Sapkowski", 384),
        new Book("Lord d'Arcy Investigates", "Randal Garrett", 229),
        new Book("Powers of the Subconscious Mind", "Joseph Murphy", 387),
        new Book("Dune", "Frank Herbert", 412),
        new Book("Harry Potter and the Deathly Hallows", "JK Rowling", 607),
        new Book("The Very Hungry Caterpillar", "Eric Carle", 32)
    );

    @GetMapping("books")
    public List<Book> getAllBooks()
    {
        return booksList;
    }
}
