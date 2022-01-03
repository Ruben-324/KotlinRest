package com.alex.kotlinrest.controller

import com.alex.kotlinrest.entity.Persona
import com.alex.kotlinrest.service.PersonaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin("*")
@RequestMapping("/persona/v1")
class PersonaController {

    @Autowired
    var personaService: PersonaService? = null

    @GetMapping()
    fun getPesona(): ResponseEntity<List<Persona>> =
        ResponseEntity.ok(personaService!!.findAll())

    @GetMapping("/{id}")
    fun getPersonaById(@PathVariable id:Int):ResponseEntity<Persona> =
        ResponseEntity.ok(personaService!!.findById(id))

    @PostMapping
    fun savePersona(@RequestBody persona:Persona): ResponseEntity<Persona> = personaService!!.create(persona)

    @PutMapping("/{id}")
    fun updatePersona(@PathVariable id:Int, @RequestBody persona: Persona) = personaService!!.updtate(id, persona)

    @DeleteMapping("/{id}")
    fun deletePersona(@PathVariable id: Int) = personaService!!.delete(id)
}