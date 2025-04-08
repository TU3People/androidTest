package com.example.myapplication

import android.graphics.Color
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.devs.vectorchildfinder.VectorChildFinder
import com.example.myapplication.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        // 먼저 XML 레이아웃을 불러와요.
        setContentView(binding.root)

        // 그 후에 코드를 넣어요.
        val ivMap = binding.mapTest
        val vector = VectorChildFinder(this, R.drawable.map_test, ivMap)
        val region = vector.findPathByName("충청남도")
        region.fillColor = Color.BLACK
        ivMap.invalidate()
    }
}
