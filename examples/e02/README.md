# Native Image 만들기

GraalVM의 Native Image를 만들고 Graal Compilation과 Native Image의 속도를 비교합니다.

- 코드 출처
    - Graal Example: https://www.graalvm.org/docs/examples/

## 설치 환경
    - sdkman(https://sdkman.io/)

## 데모 환경
    - GraalVM - 1.0.0-rc-12-grl

## 데모 환경 구성

```
~/graaldemo/examples/e02  sdk install java 1.0.0-rc-12-grl
~/graaldemo/examples/e02  sdk use java 1.0.0-rc-12-grl

Using java version 1.0.0-rc-12-grl in this shell.
```

## 실습

```
~/graaldemo/examples/e02  cat native.sh
java -version
javac CountUppercase.java
native-image -H:Name=countUppercase --no-server CountUppercase
ls
time ./countUppercase Welcome to Oracle Developer World!
~/graaldemo/examples/e02  ./native.sh
openjdk version "1.8.0_192"
OpenJDK Runtime Environment (build 1.8.0_192-20181024123616.buildslave.jdk8u-src-tar--b12)
GraalVM 1.0.0-rc12 (build 25.192-b12-jvmci-0.54, mixed mode)
[countUppercase:57068]    classlist:   1,520.03 ms
[countUppercase:57068]        (cap):   1,449.66 ms
[countUppercase:57068]        setup:   7,597.96 ms
[countUppercase:57068]   (typeflow):   6,862.65 ms
[countUppercase:57068]    (objects):   5,289.70 ms
[countUppercase:57068]   (features):     300.90 ms
[countUppercase:57068]     analysis:  27,690.38 ms
[countUppercase:57068]     universe:     286.74 ms
[countUppercase:57068]      (parse):   1,145.67 ms
[countUppercase:57068]     (inline):   1,296.64 ms
[countUppercase:57068]    (compile):  13,591.76 ms
[countUppercase:57068]      compile:  31,770.47 ms
[countUppercase:57068]        image:   1,462.94 ms
[countUppercase:57068]        write:     920.83 ms
[countUppercase:57068]      [total]: 106,440.83 ms
CountUppercase.class	README.md		graal.sh
CountUppercase.java	countUppercase		native.sh
1 (885 ms)
2 (771 ms)
3 (781 ms)
4 (826 ms)
5 (822 ms)
6 (859 ms)
7 (875 ms)
8 (869 ms)
9 (864 ms)
total: 39999996 (8425 ms)

real	0m8.457s
user	0m8.242s
sys	0m0.150s
~/graaldemo/examples/e02  cat graal.sh
java -version
javac CountUppercase.java
java CountUppercase Welcome to Oracle Developer World!
~/graaldemo/examples/e02  ./graal.sh
openjdk version "1.8.0_192"
OpenJDK Runtime Environment (build 1.8.0_192-20181024123616.buildslave.jdk8u-src-tar--b12)
GraalVM 1.0.0-rc12 (build 25.192-b12-jvmci-0.54, mixed mode)
1 (1374 ms)
2 (258 ms)
3 (176 ms)
4 (262 ms)
5 (195 ms)
6 (133 ms)
7 (140 ms)
8 (146 ms)
9 (112 ms)
total: 39999996 (2969 ms)
~/graaldemo/examples/e02  ./countUppercase Welcome to Oracle Developer World!
1 (785 ms)
2 (660 ms)
3 (646 ms)
4 (649 ms)
5 (655 ms)
6 (661 ms)
7 (670 ms)
8 (687 ms)
9 (700 ms)
total: 39999996 (6819 ms)
~/graalde
```
