package com.example.multimodule.service;

import com.example.multimodule.repository.GoodLocation;
import com.example.multimodule.repository.GoodLocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/findgood")
public class GoodLocationController {

    @Autowired
    public GoodLocationRepository goodLocationRepository;

    @GetMapping(value = "/all")
    public List<GoodLocation> getAllGoodLocations(){
        return goodLocationRepository.findAll();
    }

    @GetMapping(value = "/search/{city}")
    public List<GoodLocation> getLocationByCity(@PathVariable("city") String city){
        List<GoodLocation> locationsByCity = goodLocationRepository.findByCity(city);
        if(locationsByCity.isEmpty()){
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST);
        }
        return locationsByCity;
    }

    @PostMapping(value = "/create")
    public GoodLocation createGoodLocation(@RequestBody GoodLocation locationToAdd){
        goodLocationRepository.save(locationToAdd);
        return locationToAdd;
    }

    @PutMapping(value = "/update")
    public GoodLocation updateGoodLocation(@RequestBody GoodLocation locationToUpdate){
        goodLocationRepository.save(locationToUpdate);
        return locationToUpdate;
    }

    @DeleteMapping(value = "/delete/name={name}")
    public String deleteLocationByName(@PathVariable String name){
        List<GoodLocation> locationsToDelete = goodLocationRepository.findByName(name);
        if(locationsToDelete.isEmpty()){
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST);
        }
        goodLocationRepository.deleteAll(locationsToDelete);
        return "Deleted locations with name = " + name;
    }

    @DeleteMapping(value = "/delete/id={id}")
    public String deleteLocationById(@PathVariable Integer id){
        Optional<GoodLocation> locationToDelete = goodLocationRepository.findById(id);
        if(locationToDelete.isEmpty()){
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST);
        }
        goodLocationRepository.deleteById(id);
        return "Deleted location with id = " + id;
    }
}
