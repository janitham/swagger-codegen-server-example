package com.swagger.microservice.testservice.controllers;

import com.swagger.microservice.testservice.Pet;
import com.swagger.microservice.testservice.repository.PetRepository;
import io.swagger.api.PetApi;
import io.swagger.model.ModelApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

@RestController
public class PetController implements PetApi {

    @Autowired
    private PetRepository repository;

    @Override
    public ResponseEntity<Void> addPet(@Valid Pet body) {
        repository.save(body);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> deletePet(Long petId, String apiKey) {
        return null;
    }

    @Override
    public ResponseEntity<List<Pet>> findPetsByStatus(@NotNull @Valid List<String> status) {
        return null;
    }

    @Override
    public ResponseEntity<List<Pet>> findPetsByTags(@NotNull @Valid List<String> tags) {
        return null;
    }

    @Override
    public ResponseEntity<Pet> getPetById(Long petId) {
        Optional<Pet> optionalPet = repository.findById(petId);
        return new ResponseEntity<>(optionalPet.get(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> updatePet(@Valid Pet body) {
        return null;
    }

    @Override
    public ResponseEntity<Void> updatePetWithForm(Long petId, String name, String status) {
        return null;
    }

    @Override
    public ResponseEntity<ModelApiResponse> uploadFile(Long petId, String additionalMetadata, @Valid MultipartFile file) {
        return null;
    }
}
