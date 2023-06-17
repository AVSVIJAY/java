package com.vijay.addressbook.controller;

import com.vijay.addressbook.entity.Addreess;
import com.vijay.addressbook.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class addressController
{

    @Autowired
    AddressRepository addreessRepository;

    @GetMapping("/address")
    public ResponseEntity<List<Addreess>> getAddress(@RequestParam(required = false) String name) {
        try {
            List<Addreess> addresses = new ArrayList<>();

            if (name == null)
                addreessRepository.findAll().forEach(addresses::add);
            else
                addreessRepository.findByName(name).forEach(addresses::add);

            if (addresses.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(addresses, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }



    @PostMapping("/address")
    public ResponseEntity<Addreess> saveAddress(@RequestBody Addreess addreess) {
        try {
            Addreess _tutorial = addreessRepository
                    .save(new Addreess(addreess.getName(),  addreess.getStreet(),addreess.getCity(),addreess.getPin()));
            return new ResponseEntity<>(_tutorial, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
