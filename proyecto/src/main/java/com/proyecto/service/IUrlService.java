package com.proyecto.service;

import com.proyecto.entity.Url;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface IUrlService {

    public List<Url> getAllUrl();

    public void createUrl(Url url);

    public Url getUrlById(long id);

    public void deleteUrl(long id);

    public boolean existeUrlById(long id);

}
