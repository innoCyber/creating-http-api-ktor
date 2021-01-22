package com.jetbrains.handson.httpapi.models

import kotlinx.serialization.Serializable

@Serializable

val customerStorage = mutableListOf<Customer>()
class Customer( val id: String, val firstName: String, val lastName: String, val email: String) {
}