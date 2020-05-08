package net.soy.watermelon

import android.app.Application
import org.koin.android.ext.android.startKoin

class MyApplication : Application(){

    override fun onCreate() {
        super.onCreate()
        startKoin(androidContext = applicationContext,
        modules = myDiModule)
    }

}