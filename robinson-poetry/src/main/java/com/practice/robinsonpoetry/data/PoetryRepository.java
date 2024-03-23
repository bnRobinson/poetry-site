package com.practice.robinsonpoetry.data;

import com.practice.robinsonpoetry.models.Poetry;
import org.springframework.data.repository.CrudRepository;


public interface PoetryRepository extends CrudRepository<Poetry, String> {

}
