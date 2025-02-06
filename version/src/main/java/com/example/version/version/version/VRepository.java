package com.example.version.version.version;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VRepository extends JpaRepository<V, UUID> {

    boolean existsByName(String string);

    V findByName(String string);
}