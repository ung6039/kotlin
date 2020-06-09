package com.sist.mylistproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var memList= arrayListOf<Member>(
        Member("홍길동","서울","010-8888-7777"),
        Member("홍동","서울","010-8888-7777"),
        Member("홍길","서울","010-8888-7777"),
        Member("길동","서울","010-8888-7777"),
        Member("동동동","서울","010-8888-7777")
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val adapter=MainListAdapter(this, memList)
        mainListView.adapeter=adapter
    }
}
