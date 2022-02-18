package com.example.register

class MyRegister(private var name: String, private var password: String) {

    fun getAccount(): String {
        return "Account: $name - $password"
    }
}