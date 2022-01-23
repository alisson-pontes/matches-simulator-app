package br.com.alisson.simulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.alisson.simulator.databinding.ActivityDatailBinding

class DatailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDatailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityDatailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}