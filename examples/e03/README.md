# LLVM 코드 실행(C)

C코드를 LLVM으로 컴파일하고 sulong으로 실행하기

- 코드 출처
    - Graal Example: https://www.graalvm.org/docs/examples/

## 설치 환경
    - sdkman(https://sdkman.io/)

## 데모 환경
    - GraalVM - 1.0.0-rc-12-grl

## 데모 환경 구성

```
~/graaldemo/examples/e03  sdk install java 1.0.0-rc-12-grl
~/graaldemo/examples/e03  sdk use java 1.0.0-rc-12-grl

Using java version 1.0.0-rc-12-grl in this shell.
```

## 실습

```
~/graaldemo/examples/e03  cat llvm.sh
rm -f 1 hello.bc
clang -c -O1 -emit-llvm hello.c
lli hello.bc
~/graaldemo/examples/e03  ./llvm.sh
Hello from graalvm!
~/graaldemo/examples/e03  javac Sample.java
~/graaldemo/examples/e03  java Sample
Hello from graalvm!
~/graaldemo/examples/e03 
```
