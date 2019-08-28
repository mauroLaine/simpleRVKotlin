package com.laine.mauro.minimalrv

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_names.layoutManager = LinearLayoutManager(this)
        rv_names.adapter = SimpleRVAdapter()
        rv_names.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
    }
}
