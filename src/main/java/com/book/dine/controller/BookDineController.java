package com.book.dine.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.dine.model.BookDine;

@Controller
@RequestMapping(path = "/dine")
public class BookDineController {

    @GetMapping("/getAllRestro")
    public String getAllRestro(Model model){

        List<BookDine> bdlist = new ArrayList<BookDine>();
        BookDine bd = new BookDine();
        bd.setRestroName("Ratan Shree");
        bd.setAddress("Near old bus stand, Dewas");
        bd.setAverageCost("100 INR for two");
        bd.setOpeningHours("6:00 a.m to 1:00 p.m");
        bd.setTelephone("07272-409490");
        bd.setReviewRating("4.5");

        BookDine bd1 = new BookDine();
        bd1.setRestroName("Agarwal Colddrinks");
        bd1.setAddress("Near ICICI bank, Dewas");
        bd1.setAverageCost("200 INR for two");
        bd1.setOpeningHours("6:00 a.m to 1:00 p.m");
        bd1.setTelephone("07272-409499");
        bd1.setReviewRating("4");

        BookDine bd2 = new BookDine();
        bd2.setRestroName("Mahakal Snakes");
        bd2.setAddress("Opposite mahesh theater, Dewas");
        bd2.setAverageCost("100 $ for two");
        bd2.setOpeningHours("6:00 a.m to 1:00 p.m");
        bd2.setTelephone("07272-409941");
        bd2.setReviewRating("3.5");

        bdlist.add(bd);
        bdlist.add(bd1);
        bdlist.add(bd2);

        model.addAttribute("lists", bdlist);
        return "show-restro";
    }
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
