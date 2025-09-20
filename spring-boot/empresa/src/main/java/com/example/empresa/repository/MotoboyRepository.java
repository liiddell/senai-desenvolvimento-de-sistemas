package com.example.empresa.repository;

import com.example.empresa.model.Motoboy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MotoboyRepository extends JpaRepository <Motoboy, UUID> {
}
