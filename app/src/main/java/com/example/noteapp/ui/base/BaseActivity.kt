package com.example.noteapp.ui.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract  class BaseActivity<VB: ViewBinding> : AppCompatActivity() {
    private var _binding: VB? = null
    protected val binding: VB
        get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = getLayout()
        setContentView(binding.root)
        initViews()
    }

    protected abstract fun getLayout(): VB

    abstract fun initViews()

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}