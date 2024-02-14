package edu.temple.simplerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Step 1: Reference RecyclerView object
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        //Step 2: Provide a LayoutManager
        recyclerView.layoutManager = LinearLayoutManager(this)
        val number = IntArray(100)
        for (i in 1 ..100){
            number[i-1] = i
        }

        //Step 4: Provide a RecyclerView.Adapter
        val adapter = NumberDisplayAdapter(number)
        recyclerView.adapter = adapter
    }
}