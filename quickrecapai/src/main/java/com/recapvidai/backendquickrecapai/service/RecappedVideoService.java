package com.recapvidai.backendquickrecapai.service;


import com.recapvidai.backendquickrecapai.repository.RecappedVideoRepository;
import org.springframework.stereotype.Service;

@Service
public class RecappedVideoService {
    private final RecappedVideoRepository recappedVideoRepository;

    public RecappedVideoService(RecappedVideoRepository recappedVideoRepository) {
        this.recappedVideoRepository = recappedVideoRepository;
    }
}
