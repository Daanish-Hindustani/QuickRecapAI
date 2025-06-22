package com.recapvidai.backendquickrecapai.controller;


import com.recapvidai.backendquickrecapai.model.RecappedVideo;
import com.recapvidai.backendquickrecapai.service.RecappedVideoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/RecappedVideo")
@CrossOrigin("*")
public class RecappedVideoController {
    final RecappedVideoService recappedVideoService;

    public RecappedVideoController(RecappedVideoService recappedVideoService) {
        this.recappedVideoService = recappedVideoService;
    }

    @GetMapping("{id}")
    public ResponseEntity<Optional<RecappedVideo>> getRecappedVideoById(@PathVariable UUID id) {
        Optional<RecappedVideo> video = recappedVideoService.getRecappedVideoById(id);
        return new ResponseEntity<>(video, HttpStatus.OK);
    }



}
