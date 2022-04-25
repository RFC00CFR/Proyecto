package com.proyecto.Reviews;


import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface IReviewsService {

    public List<Review> getAllReviews();

    public void createReviews(Review reviews);

    public Review getReviewsById(int id);

    public void deleteReviews(int id);

    public boolean existeReviewsById(int id);

    public int cantidadReviews();
}
