package com.cognizant.availabilitylocation.controller;

import com.cognizant.availabilitylocation.model.Location;
import com.cognizant.availabilitylocation.repo.LocationRepo;
import com.cognizant.availabilitylocation.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/location")
@CrossOrigin(origins = "*")
public class LocationController {

    @Autowired
    private LocationRepo lr;

    @Autowired
    private LocationService ls;

    @Autowired
    private LocationController(LocationRepo lr, LocationService ls){
        this.lr = lr;
        this.ls = ls;
    }

    @GetMapping("/id")
    public ResponseEntity<Location> getById(@RequestParam int id){
        return new ResponseEntity<>(ls.getById(id), HttpStatus.ACCEPTED);
    }

    @GetMapping("/name")
    public ResponseEntity<Location> getByName(@RequestParam String name){
        return new ResponseEntity<>(ls.getByLocationName(name), HttpStatus.ACCEPTED);
    }

    @GetMapping("/zip")
    public ResponseEntity<Location> getByZip(@RequestParam int zip){
        return new ResponseEntity<>(ls.getByZip(zip), HttpStatus.ACCEPTED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Location>> getAll(){
        return new ResponseEntity<>(ls.getAll(),HttpStatus.ACCEPTED);
    }

}
