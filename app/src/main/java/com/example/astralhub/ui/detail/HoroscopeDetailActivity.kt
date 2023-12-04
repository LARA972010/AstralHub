package com.example.astralhub.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.navigation.navArgs
import com.example.astralhub.databinding.ActivityHoroscopeDetailMainBinding
import com.example.astralhub.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HoroscopeDetailActivity : AppCompatActivity() {

    private lateinit var binding : ActivityHoroscopeDetailMainBinding
    private val horoscopeDetailViewModel: HoroscopeDetailViewModel by viewModels ()
    private val args: HoroscopeDetailActivityArgs by navArgs()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHoroscopeDetailMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}