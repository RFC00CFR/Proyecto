package com.proyecto.Image;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface IImageService {

    public List<Image> getAllUrl();

    public void createUrl(Image url);

    public Image getUrlById(int id);

    public void deleteUrl(int id);

    public boolean existeUrlById(int id);

}
