package io.microlab.bookStockService;

import io.microlab.bookStockService.model.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class BookController {

    private static final Logger logger= LoggerFactory.getLogger(BookController.class);

    @GetMapping("/api/books/{personId}")
    public List<Book> getBooks(@PathVariable("personId") String personId){
        logger.info("BookController called.. at {} for personId {}",new Date(),personId);
        List<Book> bookList=new ArrayList<>();
        bookList.add(new Book(101,"No Where"));
        bookList.add(new Book(102,"Else Where"));
        return bookList;
    }
}
