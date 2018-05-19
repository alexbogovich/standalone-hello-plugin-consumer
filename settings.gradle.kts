rootProject.name = "standalone-hello-plugin-consumer"
includeBuild("../standalone-hello-plugin")

//pluginManagement {
//    resolutionStrategy {
//        eachPlugin {
//            if (requested.id.id == "com.github.alexbogovich.hello-plugin") {
//                useModule("com.github.alexbogovich:standalone-hello-plugin:${requested.version}")
//            }
//        }
//    }
//
//    repositories {
//        mavenLocal()
//        jcenter()
//    }
//}