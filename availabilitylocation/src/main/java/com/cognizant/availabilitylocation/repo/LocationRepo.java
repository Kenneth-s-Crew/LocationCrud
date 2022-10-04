package com.cognizant.availabilitylocation.repo;

import com.cognizant.availabilitylocation.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocationRepo extends JpaRepository<Location, Integer> {

    Location findById(int id);

    Location findByLocationName(String locationName);

    Location findByZip(int zip);

    List<Location> findAll();
}
