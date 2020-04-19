package io.korostenskyi.planit

import android.app.Application
import io.korostenskyi.planit.di.applicationModule
import io.korostenskyi.planit.presentation.di.fragmentModule
import io.korostenskyi.planit.presentation.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.fragment.koin.fragmentFactory
import org.koin.core.context.loadKoinModules
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import timber.log.Timber
import timber.log.Timber.DebugTree

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin()
        initTimber()
    }

    private fun initKoin() {
        val modules = listOf(
            applicationModule,
            fragmentModule,
            viewModelModule
        )
        startKoin {
            if (BuildConfig.DEBUG) printLogger(Level.DEBUG)
            androidContext(this@App)
            fragmentFactory()
            loadKoinModules(modules)
        }
    }

    private fun initTimber() {
        if (BuildConfig.DEBUG) {
            Timber.plant(DebugTree())
        }
    }
}
