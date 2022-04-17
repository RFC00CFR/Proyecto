package com.proyecto.Image;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ImageService implements IImageService {

    @Autowired
    private ImageRepository urlRepository;

    @Override
    public List<Image> getAllUrl() {
        return (List<Image>) urlRepository.findAll();
    }

    @Override
    public void createUrl(Image url) {
        urlRepository.save(url);
    }

    @Override
    public Image getUrlById(int id) {
        return urlRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteUrl(int id) {
        urlRepository.deleteById(id);
    }

    @Override
    public boolean existeUrlById(int id) {
        return urlRepository.existsById(id);
    }

}
