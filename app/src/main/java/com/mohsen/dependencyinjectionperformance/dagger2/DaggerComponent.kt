package com.mohsen.dependencyinjectionperformance.dagger2

import com.mohsen.dependencyinjectionperformance.InjectionTest
import dagger.Component

@Component(modules = [KotlinDaggerModule::class])
interface KotlinDaggerComponent {
    fun inject(injectionTest: InjectionTest.KotlinDaggerTest)
}

@Component(modules = [JavaDaggerModule::class])
interface JavaDaggerComponent {
    fun inject(injectionTest: InjectionTest.JavaDaggerTest)
}