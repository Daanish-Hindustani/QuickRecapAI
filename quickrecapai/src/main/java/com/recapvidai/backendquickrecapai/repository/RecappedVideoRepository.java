package com.recapvidai.backendquickrecapai.repository;


import com.recapvidai.backendquickrecapai.model.RecappedVideo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface RecappedVideoRepository extends JpaRepository<RecappedVideo, Integer> {
    Optional<RecappedVideo> findByIdIs(UUID rid);
}
