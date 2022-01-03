package com.alex.kotlinrest.repository

import com.alex.kotlinrest.entity.Persona
import org.springframework.data.jpa.repository.JpaRepository

interface PersonaRepository: JpaRepository<Persona, Int> {
}