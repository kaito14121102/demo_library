package com.example.login

class CustomLibrary(private var name: String) {
    fun setName(newNamea: String) {
        name = newNamea
    }

    fun getName(): String = name
}