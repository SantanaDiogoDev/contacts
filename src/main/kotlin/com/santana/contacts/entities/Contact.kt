package com.santana.contacts.entities

import jakarta.persistence.*
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Size
import org.jetbrains.annotations.NotNull

@Entity
@Table(name="contacts")
class Contact {
    @field:Id
    @field:GeneratedValue(strategy = GenerationType.SEQUENCE)
    val id: Long = 0

    @field: NotNull
    @field:Size(min = 5, max = 50, message = "Tamanho inválido")
    var name: String = ""

    @field:NotNull
    @field:Email
    var email: String = ""
}