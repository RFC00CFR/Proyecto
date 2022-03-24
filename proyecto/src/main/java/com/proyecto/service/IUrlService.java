package com.proyecto.service;

import com.proyecto.entity.Url;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface IUrlService {

    public List<Url> getAllUrl();

    public void createUrl(Url url);

    public Url getUrlById(int id);

    public void deleteUrl(int id);

    public boolean existeUrlById(int id);

}
