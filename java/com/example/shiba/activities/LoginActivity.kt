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

class LoginActivity : AppCompatActivity() {
    lateinit var Txtregister: TextView
    lateinit var Btnsignin: Button
    lateinit var Edtemail: EditText
    private lateinit var Edtpass: EditText
    lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        Txtregister = findViewById(R.id.txt_login_register)
        Btnsignin = findViewById(R.id.btn_login_signin)
        Edtemail = findViewById(R.id.EdtemailAddress)
        Edtpass = findViewById(R.id.Edtpassword)
        auth = FirebaseAuth.getInstance()

        fun login() {
            val email = Edtemail.text.toString()
            val pass = Edtpass.text.toString()
            auth.signInWithEmailAndPassword(email, pass).addOnCompleteListener(this) {
                if (it.isSuccessful) {
                    Toast.makeText(this, "Successfully LoggedIn", Toast.LENGTH_SHORT).show()
                } else
                    Toast.makeText(this, "Log In failed ", Toast.LENGTH_SHORT).show()
            }
        }



        Txtregister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
        Btnsignin.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}