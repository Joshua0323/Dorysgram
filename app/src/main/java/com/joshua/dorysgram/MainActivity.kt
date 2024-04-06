package com.joshua.dorysgram

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.joshua.dorysgram.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().replace(R.id.main_fl, HomeFragment()).commitAllowingStateLoss()
        // this makes the icon not tinted
        binding.mainBottomNav.itemIconTintList = null
        binding.mainBottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.tab_home -> {
                    supportFragmentManager.beginTransaction().replace(R.id.main_fl, HomeFragment())
                        .commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }
                R.id.tab_search -> {
                    supportFragmentManager.beginTransaction().replace(R.id.main_fl, SearchFragment())
                        .commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }
                R.id.tab_upload -> {
                    val intent = Intent(this, UploadActivity::class.java)
                    startActivity(intent)
                    return@setOnItemSelectedListener true
                }
                R.id.tab_heart -> {
                    supportFragmentManager.beginTransaction().replace(R.id.main_fl, HeartFragment())
                        .commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }
                R.id.tab_mypage -> {
                    supportFragmentManager.beginTransaction().replace(R.id.main_fl, MyPageFragment())
                        .commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }
                else -> {
                    false
                }
            }
        }
    }
}