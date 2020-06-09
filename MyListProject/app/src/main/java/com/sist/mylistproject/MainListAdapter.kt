package com.sist.mylistproject

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import org.w3c.dom.Text
import java.lang.reflect.Member
import java.util.*;
import java.security.AccessControlContext
import kotlin.collections.ArrayList

class MainListAdapter(val context: Context, val memberList:ArrayList<Member>):BaseAdapter(){

    // position : index
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view:View=LayoutInflater.from(context).inflate(R.layout.item_list,null)
        val name=view.findViewById<TextView>(R.id.NameTextView)
        val addr=view.findViewById<TextView>(R.id.AddrtextView)
        val tel=view.findViewById<TextView>(R.id.TelltextView)

        val member = memberList[position];
        name.text=member.name
        addr.text=member.addr
        tel.text =member.tel
        return view;
    }

    override fun getItem(position: Int): Any {
        return memberList[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    // 루프 회수 지정
    override fun getCount(): Int {
        return memberList.size
    }
}