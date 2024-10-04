package com.vaultspay.vaultspay_modularize

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.findNavController
import com.vaultspay.auth.AuthFragment
import com.vaultspay.vaultspay_modularize.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var layoutBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        layoutBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(layoutBinding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

       /* layoutBinding.btnUserSide.setOnClickListener {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, AuthFragment())
            transaction.addToBackStack(null) // Add to backstack to allow navigation back
            transaction.commit()
        }*/
    }
}