# Polyglot 데모 - 1

자바 코드에서 javascript, ruby, r, python 코드를 실행합니다.

- 코드 출처
    - Graal Example: https://www.graalvm.org/docs/examples/

## 설치 환경
    - sdkman(https://sdkman.io/)

## 데모 환경
    - GraalVM - 1.0.0-rc-12-grl

## 데모 환경 구성

```
~/graaldemo/examples/e04  sdk install java 1.0.0-rc-12-grl
~/graaldemo/examples/e04  sdk use java 1.0.0-rc-12-grl

Using java version 1.0.0-rc-12-grl in this shell.

~/graaldemo/examples/e04  gu install python
~/graaldemo/examples/e04  gu install javascript
~/graaldemo/examples/e04  gu install ruby
~/graaldemo/examples/e04  gu install R

```

## 실습

```
~/graaldemo/examples/e04  ./graal.sh
openjdk version "1.8.0_192"
OpenJDK Runtime Environment (build 1.8.0_192-20181024123616.buildslave.jdk8u-src-tar--b12)
GraalVM 1.0.0-rc12 (build 25.192-b12-jvmci-0.54, mixed mode)
[R, js, python, llvm, ruby]
안녕, 루비
안녕, 파이썬
안녕, JS
안녕, R
real	0m12.767s
user	0m53.101s
sys	0m1.476s
 ~/graaldemo/examples/e04 
```
