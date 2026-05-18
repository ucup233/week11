package com.example.week11.repository;

import com.example.week11.model.Profil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfilRepository extends JpaRepository<Profil, String> {
}
