package edu.temple.simplerecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation

/* Step 3a: Provide Adapter Parent */
class NumberDisplayAdapter(number: IntArray) : RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>() {
    private val number = number
    class NumberViewHolder(_textView: TextView) : RecyclerView.ViewHolder (_textView) {
        val textV = _textView


    }
    //Step 3b: Complete function definitions for adapter
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        return NumberViewHolder(
            TextView(
                parent.context
            )
        )
    }

    override fun getItemCount(): Int {
        return number.size
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.textV.text= number[position].toString()
    }


}