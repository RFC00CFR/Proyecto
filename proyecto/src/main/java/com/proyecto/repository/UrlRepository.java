
package com.proyecto.repository;

import com.proyecto.entity.Url;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UrlRepository extends CrudRepository<Url,Integer>{

}
