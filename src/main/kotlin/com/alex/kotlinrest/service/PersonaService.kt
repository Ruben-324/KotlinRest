package com.alex.kotlinrest.service

import com.alex.kotlinrest.entity.Persona
import com.alex.kotlinrest.repository.BaseService
import com.alex.kotlinrest.repository.PersonaRepository
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class PersonaService(
   val personaRepository: PersonaRepository
):BaseService<Persona> {

    override fun findAll(): MutableList<Persona> =
         personaRepository.findAll()


    override fun findById(id: Int):Persona =
         personaRepository.findById(id).get()

    override fun updtate(id:Int, entity: Persona): ResponseEntity<Persona> {
        entity.id = id
        val updatePer = personaRepository.save(entity)
        return ResponseEntity.ok(updatePer)
    }

    override fun create(entity: Persona): ResponseEntity<Persona> {
        val persona = personaRepository.save(entity)
        return ResponseEntity.ok(persona)
    }

    override fun delete(id: Int): ResponseEntity<Persona> {
        val per = personaRepository.getById(id)
        personaRepository.delete(per)
        return ResponseEntity.status(204).body(per)
    }

}