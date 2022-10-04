package com.cognizant.availabilitylocation.service;

import com.cognizant.availabilitylocation.model.Location;
import com.cognizant.availabilitylocation.repo.LocationRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {
    private final LocationRepo lr;

    public LocationService(LocationRepo lr){
        this.lr = lr;
    }

    public Location getById(int id){
        return lr.findById(id);
    }

    public Location getByLocationName(String locationName){
        return lr.findByLocationName(locationName);
    }

    public Location getByZip(int zip){
        return lr.findByZip(zip);
    }

    public List<Location> getAll(){
        return lr.findAll();
    }

}
