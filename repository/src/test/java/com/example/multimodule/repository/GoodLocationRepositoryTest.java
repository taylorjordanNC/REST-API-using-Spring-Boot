package com.example.multimodule.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataMongoTest
public class GoodLocationRepositoryTest {

    @Autowired
    private GoodLocationRepository goodLocationRepository;

    @Test
    public void findByCity(){
    }

    @Test
    public void findById(){

    }
}
