package com.mohsen.dependencyinjectionperformance

import com.mohsen.dependencyinjectionperformance.custom.DIContainer
import com.mohsen.dependencyinjectionperformance.custom.customJavaModule
import com.mohsen.dependencyinjectionperformance.custom.customKotlinModule
import com.mohsen.dependencyinjectionperformance.dagger2.DaggerJavaDaggerComponent
import com.mohsen.dependencyinjectionperformance.dagger2.DaggerKotlinDaggerComponent
import com.mohsen.dependencyinjectionperformance.dagger2.JavaDaggerComponent
import com.mohsen.dependencyinjectionperformance.dagger2.KotlinDaggerComponent
import com.mohsen.dependencyinjectionperformance.katana.katanaJavaModule
import com.mohsen.dependencyinjectionperformance.katana.katanaKotlinModule
import com.mohsen.dependencyinjectionperformance.koin.koinJavaModule
import com.mohsen.dependencyinjectionperformance.koin.koinKotlinModule
import org.kodein.di.Kodein
import org.kodein.di.direct
import org.kodein.di.erased.instance
import org.koin.core.KoinComponent
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin
import org.koin.core.get
import org.rewedigital.katana.Component
import org.rewedigital.katana.Katana
import org.rewedigital.katana.android.environment.AndroidEnvironmentContext
import org.rewedigital.katana.android.environment.AndroidEnvironmentContext.Profile.SPEED
import org.rewedigital.katana.createComponent
import javax.inject.Inject

class InjectionTest : KoinComponent {

    private val kotlinDaggerTest = KotlinDaggerTest()
    private val javaDaggerTest = JavaDaggerTest()

    private val rounds = 100

    fun runTests(): List<LibraryResult> {
        val results = listOf(
            koinTest(),
            kodeinTest(),
            katanaTest(),
            customTest(),
            daggerTest()
        )
//        reportMarkdown(results)
        return results
    }



    private fun runTest(
        setup: () -> Unit,
        test: () -> Unit,
        teardown: () -> Unit = {}
    ): TestResult {
        val startup = (1..rounds).map { measureTime { setup() }.also { teardown() } }
        setup()

        val testDurations = (1..rounds).map { measureTime { test() } }
        teardown()
        return TestResult(startup, testDurations)
    }

    private fun koinTest(): LibraryResult {
        log("Running Koin...")
        return LibraryResult("Koin", mapOf(
            Variant.KOTLIN to runTest(
                setup = {
                    startKoin {
                        modules(koinKotlinModule)
                    }
                },
                test = { get<Fib8>() },
                teardown = { stopKoin() }
            ),
            Variant.JAVA to runTest(
                setup = {
                    startKoin {
                        modules(koinJavaModule)
                    }
                },
                test = { get<FibonacciJava.Fib8>() },
                teardown = { stopKoin() }
            )
        ))
    }

    private fun kodeinTest(): LibraryResult {
        log("Running Kodein...")
        lateinit var kodein: Kodein
        return LibraryResult("Kodein", mapOf(
            Variant.KOTLIN to runTest(
                setup = { kodein = Kodein { import(kodeinKotlinModule) } },
                test = { kodein.direct.instance<Fib8>() }
            ),
            Variant.JAVA to runTest(
                setup = { kodein = Kodein { import(kodeinKotlinModule) } },
                test = { kodein.direct.instance<Fib8>() }
            )
        ))
    }

    private fun katanaTest(): LibraryResult {
        log("Running Katana...")
        Katana.environmentContext = AndroidEnvironmentContext(profile = SPEED)
        lateinit var component: Component
        return LibraryResult("Katana", mapOf(
            Variant.KOTLIN to runTest(
                setup = { component = createComponent(modules = listOf(katanaKotlinModule)) },
                test = { component.injectNow<Fib8>() }
            ),
            Variant.JAVA to runTest(
                setup = { component = createComponent(modules = listOf(katanaJavaModule)) },
                test = { component.injectNow<FibonacciJava.Fib8>() }
            )
        ))
    }

    private fun customTest(): LibraryResult {
        log("Running Custom...")
        return LibraryResult("Custom", mapOf(
            Variant.KOTLIN to runTest(
                setup = { DIContainer.loadModule(customKotlinModule) },
                test = { DIContainer.get<Fib8>() },
                teardown = { DIContainer.unloadModules() }
            ),
            Variant.JAVA to runTest(
                setup = { DIContainer.loadModule(customJavaModule) },
                test = { DIContainer.get<FibonacciJava.Fib8>() },
                teardown = { DIContainer.unloadModules() }
            )
        ))
    }

    private fun daggerTest(): LibraryResult {
        log("Running Dagger...")
        lateinit var kotlinComponent: KotlinDaggerComponent
        lateinit var javaComponent: JavaDaggerComponent
        return LibraryResult("Dagger", mapOf(
            Variant.KOTLIN to runTest(
                setup = { kotlinComponent = DaggerKotlinDaggerComponent.create() },
                test = { kotlinComponent.inject(kotlinDaggerTest) }
            ),
            Variant.JAVA to runTest(
                setup = { javaComponent = DaggerJavaDaggerComponent.create() },
                test = { javaComponent.inject(javaDaggerTest) }
            )
        ))
    }

    class KotlinDaggerTest {
        @Inject
        lateinit var daggerFib8: Fib8
    }

    class JavaDaggerTest {
        @Inject
        lateinit var daggerFib8: FibonacciJava.Fib8
    }
}
