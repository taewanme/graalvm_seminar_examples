# Micronaut의 graalvm native image 지원

Micronaut 애플리케이션 네이티브 이미지 만들기.

- 코드 출처
    - https://github.com/micronaut-guides/micronaut-creating-first-graal-app

## 설치 환경
    - sdkman(https://sdkman.io/)

## 데모 환경
    - GraalVM - 1.0.0-rc-12-grl
    - gradle

## 데모 환경 구성

```
~/graaldemo/examples/e04  sdk install java 1.0.0-rc-12-grl
~/graaldemo/examples/e04  sdk use java 1.0.0-rc-12-grl
~/graaldemo/examples/e04  sdk install micronaut
~/graaldemo/examples/e04  sdk install gradle 
```

## 실습

```
⚙  ~/graaldemo/examples/e05/micronaut  ./build-native-image.sh
Starting a Gradle Daemon (subsequent builds will be faster)

BUILD SUCCESSFUL in 6s
10 actionable tasks: 10 up-to-date
[complete:60395]    classlist:   4,194.42 ms
[complete:60395]        (cap):   1,008.91 ms
[complete:60395]        setup:   7,178.60 ms
Warning: class initialization of class io.micronaut.jackson.modules.AfterburnerModuleFactory failed with exception java.lang.NoClassDefFoundError: com/fasterxml/jackson/module/afterburner/AfterburnerModule. This class will be initialized at run time because either option --report-unsupported-elements-at-runtime or option --allow-incomplete-classpath is used for image building. Use the option  
## 로그 생략
[complete:60395]   (typeflow):  32,402.04 ms
[complete:60395]    (objects):  18,204.71 ms
[complete:60395]   (features):   1,596.13 ms
[complete:60395]     analysis:  69,129.88 ms
[complete:60395]     universe:   1,251.95 ms
[complete:60395]      (parse):   6,089.64 ms
[complete:60395]     (inline):   7,783.14 ms
[complete:60395]    (compile):  43,766.75 ms
[complete:60395]      compile:  75,284.23 ms
[complete:60395]        image:   4,872.08 ms
[complete:60395]        write:   1,871.05 ms
[complete:60395]      [total]: 199,046.34 ms
 ⚙  ~/graaldemo/examples/e05/micronaut  ls
Dockerfile            complete              gradlew
build                 docker-build.sh       gradlew.bat
build-native-image.sh gradle                micronaut-cli.yml
build.gradle          gradle.properties     src
 ⚙  ~/graaldemo/examples/e05/micronaut  ./complete
12:28:09.400 [main] INFO  io.micronaut.runtime.Micronaut - Startup completed in 22ms. Server Running: http://localhost:8080

```

- REST API 조회

```
~  curl http://localhost:8080/conferences/random
{"name":"Micronaut Summit"}%
~ 
```
