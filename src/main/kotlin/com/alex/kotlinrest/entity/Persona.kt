package com.alex.kotlinrest.entity

import javax.persistence.*

@Entity
@Table(name = "persona")
open class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    open var id: Int? = null

    @Column(name = "nombre", nullable = false, length = 54)
    open var nombre: String? = null

    @Column(name = "apellido", nullable = false, length = 58)
    open var apellido: String? = null
}