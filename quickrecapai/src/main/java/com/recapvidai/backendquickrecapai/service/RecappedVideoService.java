package com.recapvidai.backendquickrecapai.service;


import com.recapvidai.backendquickrecapai.model.RecappedVideo;
import com.recapvidai.backendquickrecapai.repository.RecappedVideoRepository;

import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class RecappedVideoService {
    private final RecappedVideoRepository recappedVideoRepository;

    public RecappedVideoService(RecappedVideoRepository recappedVideoRepository) {
        this.recappedVideoRepository = recappedVideoRepository;
    }

    public Optional<RecappedVideo> getRecappedVideoById(UUID id){
        return recappedVideoRepository.getRecappedVideoById(id);
    }
}
