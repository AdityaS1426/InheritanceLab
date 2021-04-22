package com.lab.inheritance;

import Lab.Book;
import Lab.PictureBook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@RequestMapping("")
@Controller
public class MainController {
    @GetMapping("/")
    public String Index(){
        return "index";
    }

    @GetMapping("/inheritance")
    public String Inheritance(@RequestParam(value="title", required = false) String title, @RequestParam(value="author", required = false) String author, @RequestParam(value="illustrator", required = false) String illustrator, Model model) {
        long startTime = System.nanoTime();
        if (title == null || title == "") {
            title = "Diary of a Wimpy Kid";
        }
        if (author == null || author == "") {
            author = "Jeff Kinney";
        }
        if (illustrator == null || illustrator == "") {
            Book book = new Book(title, author);
            model.addAttribute("sentence", book);
            long finalTime = System.nanoTime() - startTime;
            model.addAttribute("time", "The time it took to execute the commands was " + finalTime + " nanoseconds.");
            return "inheritance";
        }
        PictureBook picturebook = new PictureBook(title, author, illustrator);
        model.addAttribute("sentence", picturebook);
        long finalTime = System.nanoTime() - startTime;
        model.addAttribute("time", "The time it took to execute the commands was " + finalTime + " nanoseconds.");
        return "inheritance";
    }
}
