package com.example.noteapp.ui

import com.example.noteapp.databinding.ActivityMainBinding
import com.example.noteapp.ui.base.BaseActivity

class MainActivity: BaseActivity<ActivityMainBinding>() {
    override fun getLayout(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun initViews() {
    }
}