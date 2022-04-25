package com.proyecto.Reviews;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class ReviewsController {

    @Autowired
    private IReviewsService ReviewsService;

    @GetMapping("/reviews")
    public String reviews(Model model) {
        List<Review> listaReviews = ReviewsService.getAllReviews();
        model.addAttribute("titulo", "Reviews");
        model.addAttribute("Reviews", listaReviews);
        model.addAttribute("link", "/Reviews");
        return "reviews";
    }

}
