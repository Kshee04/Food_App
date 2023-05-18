package com.example.shiba.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.shiba.MainActivity
import com.example.shiba.R
import com.google.firebase.auth.FirebaseAuth

class RegisterActivity : AppCompatActivity() {
    lateinit var Txtsignin: TextView
    lateinit var Btnregister: Button
    lateinit var auth: FirebaseAuth
    lateinit var edtname: EditText
    lateinit var edtEmail: EditText
    private lateinit var etPass: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        Txtsignin = findViewById(R.id.txt_sign)
        Btnregister = findViewById(R.id.btn_register)
        edtEmail = findViewById(R.id.edt_email)
        etPass = findViewById(R.id.edt_pass)
        edtname = findViewById(R.id.name_editText)
        auth = FirebaseAuth.getInstance()


        Txtsignin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
        Btnregister.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

        private fun register() {
            val name=edtname.text.toString()
            val email = edtEmail.text.toString()
            val pass = etPass.text.toString()
            if (email.isBlank() || pass.isBlank()|| name.isBlank()) {
                Toast.makeText(this, "Please Email and Password and Email can't be blank", Toast.LENGTH_LONG)
                    .show()
                return
            }
            auth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener(this) {
                if (it.isSuccessful) {
                    Toast.makeText(this, "Signed successfully", Toast.LENGTH_LONG).show()
                    finish()
                } else {
                    Toast.makeText(this, "Failed to create", Toast.LENGTH_LONG).show()
                }

            }
        }
    }