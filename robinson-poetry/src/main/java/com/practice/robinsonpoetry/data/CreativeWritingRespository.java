package com.practice.robinsonpoetry.data;


import com.practice.robinsonpoetry.models.CreativeWriting;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreativeWritingRespository extends CrudRepository<CreativeWriting, Integer> {

}
