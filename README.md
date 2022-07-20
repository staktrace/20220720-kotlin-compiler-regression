This repository reproduces what appears to be a regression in the kotlin toolchain in version 1.7.0.
At least, it appears to me to be a regression; it may be an intentional change.
If it is an intentional change, it is not at all clear what the intended code change is meant to be to resolve the compilation error.

## Steps to reproduce

1. Check out this repo
2. Run `./gradlew compileKotlin`
3. Observe failure that starts out like this:
```
> Task :compileKotlin FAILED
e: Supertypes of the following classes cannot be resolved. Please make sure you have the required dependencies in the classpath:
    class com.google.protobuf.DescriptorProtos.DescriptorProto.Builder, unresolved supertypes: DescriptorProtoOrBuilder
[.. much output trimmed ..]
```

## Compare behaviour against kotlin 1.6.21

1. Modify the build.gradle.kts file to use the Kotlin 1.6.21 compiler (comment out the 1.7.0 plugin and uncomment the 1.6.21 line)
2. Run `./gradlew compileKotlin`
3. Observe the build succeeds.
