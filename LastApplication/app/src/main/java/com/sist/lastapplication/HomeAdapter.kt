package com.sist.lastapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso

class HomeAdapter(private val context: Context,
private val dataList: ArrayList<HashMap<String, String>>) : BaseAdapter() {

    private val inflater: LayoutInflater = this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    override fun getCount(): Int { return dataList.size }
    override fun getItem(position: Int): Int { return position }
    override fun getItemId(position: Int): Long { return position.toLong() }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var dataitem = dataList[position]

        val rowView = inflater.inflate(R.layout.home_item, parent, false)
        rowView.findViewById<TextView>(R.id.titleView).text = dataitem.get("title")
        rowView.findViewById<TextView>(R.id.subjectText).text = dataitem.get("price")
        rowView.findViewById<TextView>(R.id.catenoTextVeiw).text = dataitem.get("no")
        Picasso.get()
            .load(dataitem.get("image"))
            .resize(397, 120)
            .centerCrop()
            .into(rowView.findViewById<ImageView>(R.id.imageView))

        rowView.tag = position
        return rowView
    }
}