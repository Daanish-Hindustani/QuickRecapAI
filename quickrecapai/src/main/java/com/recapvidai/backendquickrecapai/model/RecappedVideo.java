package com.recapvidai.backendquickrecapai.model;


import jakarta.persistence.*;
import lombok.Data;
import jakarta.persistence.Table;
import org.hibernate.annotations.*;

import java.util.UUID;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "recapped_videos", uniqueConstraints = {
        @UniqueConstraint(columnNames = "id")
})
public class RecappedVideo {
    @Id
    @UuidGenerator
    @Column(unique = true, nullable = false, updatable = false)
    private UUID id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String description;

    @Column(nullable = false)
    private String videoUrl;

    @Column(nullable = false)
    private String originalVideoUrl;

    @Column(nullable = false)
    private LocalDateTime createdOn;

    @Column(nullable = false)
    private LocalDateTime updatedOn;

}
