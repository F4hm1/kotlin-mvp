package com.architecture.kotlinmvp.home.di

import com.base.di.ActivityScope
import com.base.di.component.AppComponent
import com.architecture.kotlinmvp.home.HomeActivity

import dagger.Component

@ActivityScope
@Component(dependencies = arrayOf(AppComponent::class), modules = arrayOf(HomeActivityModule::class))
interface HomeActivityComponent {

    fun inject(homeActivity: HomeActivity)
}
