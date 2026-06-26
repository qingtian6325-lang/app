pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

plugins {
    // 1. 如果你不需要这个插件，建议直接删除这两行
    // 如果一定要用，请去 GitHub 找到对应的版本号，比如 "1.0.5"
    // id("com.highcapable.sweetdependency") version "1.0.5"
    // id("com.highcapable.sweetproperty") version "1.0.5"
}

// 2. 如果上面删除了 plugins，这里也要删掉或注释掉
// sweetProperty {
//     rootProject { all { isEnable = false } }
// }

// 3. 将 __PROJECT_NAME__ 改成你 GitHub 仓库的真实名称
rootProject.name = "MyTVBusApp" 

include(":app")
