package com.proyecto.Reviews;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ReviewsService implements IReviewsService {

    @Autowired
    private ReviewsRepository ReviewsRepository;

    @Override
    public List<Review> getAllReviews() {
        return (List<Review>) ReviewsRepository.findAll();
    }

    @Override
    public void createReviews(Review reviews) {
        ReviewsRepository.save(reviews);
    }

    @Override
    public Review getReviewsById(int id) {
        return ReviewsRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteReviews(int id) {
        ReviewsRepository.deleteById(id);
    }

    @Override
    public boolean existeReviewsById(int id) {
        return ReviewsRepository.existsById(id);
    }

    @Override
    public int cantidadReviews() {
        return (int) ReviewsRepository.count();
    }

}
