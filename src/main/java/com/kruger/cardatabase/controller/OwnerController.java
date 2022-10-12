package com.kruger.cardatabase.controller;

import com.kruger.cardatabase.domain.Owner;
import com.kruger.cardatabase.exception.ResourceNotFoundException;
import com.kruger.cardatabase.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class OwnerController {

    @Autowired
    private OwnerRepository ownerRepository;

    @GetMapping("/owner")
    public Page<Owner> getOwner(Pageable pageable){
        return ownerRepository.findAll(pageable);
    }

    @PostMapping("/owner")
    public Owner createOwner(@Valid @RequestBody Owner owner){
        return ownerRepository.save(owner);
    }

    @PutMapping("/owner/{ownerId}")
    public  Owner updateOwner(@PathVariable Long ownerId,
                              @Valid @RequestBody Owner ownerRequest ){
        return ownerRepository.findById(ownerId)
                .map(owner -> {
                    owner.setFirstName(ownerRequest.getFirstName());
                    owner.setLastName(ownerRequest.getLastName());
                    return  ownerRepository.save(owner);
                }).orElseThrow(()->new ResourceNotFoundException("Owner no found with id"+ ownerId));
    }

    @DeleteMapping("/owner/{ownerId}")
    public ResponseEntity<?> deleteOwner(@PathVariable Long ownerId){
        return ownerRepository.findById(ownerId)
                .map(owner -> {
                    ownerRepository.delete(owner);
                    return  ResponseEntity.ok().build();
                }).orElseThrow(()-> new ResourceNotFoundException("Owner not found with id"+ ownerId));
    }
    }
