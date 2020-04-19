package io.korostenskyi.planit.presentation.di

import io.korostenskyi.planit.presentation.screen.home.HomeFragment
import org.koin.androidx.fragment.dsl.fragment
import org.koin.dsl.module

val fragmentModule = module {

    fragment { HomeFragment() }
}
