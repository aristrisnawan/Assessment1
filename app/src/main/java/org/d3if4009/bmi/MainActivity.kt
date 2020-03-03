package org.d3if4009.bmi

import android.content.ActivityNotFoundException
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.core.app.ShareCompat
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.fragment_hasil.*
import kotlinx.android.synthetic.main.fragment_home.*
import org.d3if4009.bmi.databinding.ActivityMainBinding
import java.security.AccessController
const val KEY_BERATBADAN = "beratbadan_key"
const val KEY_TINGGIBADAN = "tinggibadan_key"

class MainActivity : AppCompatActivity() {
    private var beratBadan = 0
    private var tinggiBadan = 0
private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)

        btn_hitung.setOnClickListener {
            val hitung = beratBadan / (tinggiBadan * tinggiBadan)
        }
        navController = this.findNavController(R.id.navigation)
        NavigationUI.setupActionBarWithNavController(this, navController)


    }


    override fun onSupportNavigateUp(): Boolean {
        navController = this.findNavController(R.id.navigation)
        return navController.navigateUp()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(KEY_BERATBADAN,beratBadan)
        outState.putInt(KEY_TINGGIBADAN, tinggiBadan)
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
    }

    }


