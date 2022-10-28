package com.geektech.homework3_6
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private var fragment:MainFragment = MainFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportFragmentManager.beginTransaction().replace(R.id.main_container,fragment).commit()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}