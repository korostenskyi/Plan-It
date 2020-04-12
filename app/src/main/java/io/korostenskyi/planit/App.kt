package io.korostenskyi.planit

import android.app.Application
import io.korostenskyi.planit.di.applicationModule
import io.korostenskyi.planit.presentation.di.presentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import timber.log.Timber
import timber.log.Timber.DebugTree

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin()
        initTimber()
    }

    private fun initKoin() {
        startKoin {
            androidContext(this@App)
            modules(applicationModule + presentationModule)
        }
    }

    private fun initTimber() {
        if (BuildConfig.DEBUG) {
            Timber.plant(DebugTree())
        }
    }
}
