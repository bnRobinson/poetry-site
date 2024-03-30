package com.practice.robinsonpoetry.data;

import com.practice.robinsonpoetry.models.Poetry;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PoetryRepository extends CrudRepository<Poetry, Integer> {

}
