package com.dodge.hero.z.mvpdemo.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.dodge.hero.z.mvpdemo.R
import com.dodge.hero.z.mvpdemo.di.HttpService
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var httpService : HttpService


    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println(httpService.toString())

    }
}
