[![](https://jitpack.io/v/babedev/thisthenthat.svg)](https://jitpack.io/#babedev/thisthenthat)

# ThisThenThat
Control Kotlin code flow more easier

#### Installation

Gradle
```Gradle
allprojects {
   repositories {
      ...
      maven { url "https://jitpack.io" }
   }
}

dependencies {
   implementation 'com.github.babedev:thisthenthat:0.1.0'
}
```

#### Usage

```Kotlin
val greetMessage = someWhere()

greetMessage.isNotEmpty {
      print(it)
}
```
