package com.boot.demo.dao;

import org.springframework.data.repository.CrudRepository;
import com.boot.demo.model.Alien;

public interface AlienRepo extends CrudRepository<Alien,Integer>
{

}
