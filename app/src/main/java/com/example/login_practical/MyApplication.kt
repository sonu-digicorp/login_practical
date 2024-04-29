package com.example.login_practical

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import java.io.File

@HiltAndroidApp
class MyApplication :Application() {

    companion object{
        lateinit var myApplication: MyApplication
        private set
    }

    override fun onCreate() {
        super.onCreate()
        myApplication =this
        val dexFile:File=codeCacheDir
        dexFile.setReadOnly()
    }
}