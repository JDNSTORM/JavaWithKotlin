package ph.projects.navor_jamesdave.javawithkotlin.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ph.projects.navor_jamesdave.javawithkotlin.R
import ph.projects.navor_jamesdave.javawithkotlin.databinding.ActivityGreetingsBinding

class KotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityGreetingsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.setupUI()
    }

    private fun ActivityGreetingsBinding.setupUI(){
        btnGreet.setOnClickListener {
            msgGreetings.setText(R.string.hello_from_kotlin)
        }
    }
}