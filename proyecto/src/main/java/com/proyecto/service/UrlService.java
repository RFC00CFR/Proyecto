package com.proyecto.service;

import com.proyecto.entity.Url;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.proyecto.repository.UrlRepository;

@Service
public class UrlService implements IUrlService {

    @Autowired
    private UrlRepository urlRepository;

    @Override
    public List<Url> getAllUrl() {
        return (List<Url>) urlRepository.findAll();
    }

    @Override
    public void createUrl(Url url) {
        urlRepository.save(url);
    }

    @Override
    public Url getUrlById(long id) {
        return urlRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteUrl(long id) {
        urlRepository.deleteById(id);
    }

    @Override
    public boolean existeUrlById(long id) {
        return urlRepository.existsById(id);
    }

}
