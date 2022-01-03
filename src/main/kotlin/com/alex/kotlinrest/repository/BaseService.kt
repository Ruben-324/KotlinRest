package com.alex.kotlinrest.repository

import org.springframework.http.ResponseEntity

interface BaseService<T> {

    fun findAll():List<T>
    fun findById(id:Int):T
    fun updtate(id:Int, entity: T): ResponseEntity<T>
    fun create(entity: T): ResponseEntity<T>
    fun delete(id: Int):ResponseEntity<T>

}