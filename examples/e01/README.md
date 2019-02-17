# graal Compilation와 Tiered Compilation 비교

- 코드 출처
    - Graal Example: https://www.graalvm.org/docs/examples/

## 설치 환경
    - sdkman(https://sdkman.io/)

## 데모 환경
    - OpenJDK 11

## 데모 환경 구성

```
~/graaldemo/examples/e01  sdk install java 11.0.2-open

## 로그 생략

~/graaldemo/examples/e01  sdk list java
================================================================================
Available Java Versions
================================================================================
     13.ea.07-open       8.0.202.hs-adpt
     12.ea.31-open       8.0.201-oracle
     11.0.2-sapmchn      8.0.192-zulufx
     11.0.2-zulu         7.0.181-zulu
 > * 11.0.2-open       * 1.0.0-rc-12-grl
     11.0.2.j9-adpt      1.0.0-rc-11-grl
     11.0.2.hs-adpt      1.0.0-rc-10-grl
     11.0.1-zulufx       1.0.0-rc-9-grl
     10.0.2-zulu         1.0.0-rc-8-grl
   * 10.0.2-open
     9.0.7-zulu
     9.0.4-open
     8.0.202-zulu
     8.0.202-amzn
     8.0.202.j9-adpt

================================================================================
+ - local version
* - installed
> - currently in use
================================================================================
 ~/graaldemo/examples/e01 
```

## 실습

- 실습
    - graal.sh
    - hotspot.sh
    - graal_log.sh
    - hotspot_log.sh

```
~/graaldemo/examples/e01  ./graal.sh
openjdk version "1.8.0_192"
OpenJDK Runtime Environment (build 1.8.0_192-20181024123616.buildslave.jdk8u-src-tar--b12)
GraalVM 1.0.0-rc12 (build 25.192-b12-jvmci-0.54, mixed mode)
1 (1466 ms)
2 (374 ms)
3 (176 ms)
4 (218 ms)
5 (191 ms)
6 (108 ms)
7 (156 ms)
8 (111 ms)
9 (159 ms)
total: 39999996 (3065 ms)

real	0m3.184s
user	0m8.775s
sys	0m0.578s
 ~/graaldemo/examples/e01  ./hotspot.sh
openjdk version "1.8.0_192"
OpenJDK Runtime Environment (build 1.8.0_192-20181024123616.buildslave.jdk8u-src-tar--b12)
GraalVM 1.0.0-rc12 (build 25.192-b12-jvmci-0.54, mixed mode)
1 (1400 ms)
2 (345 ms)
3 (191 ms)
4 (242 ms)
5 (249 ms)
6 (118 ms)
7 (171 ms)
8 (117 ms)
9 (117 ms)
total: 39999996 (3118 ms)

real	0m3.243s
user	0m9.254s
sys	0m0.564s
 ~/graaldemo/examples/e01  ./graal_log.sh
openjdk version "1.8.0_192"
OpenJDK Runtime Environment (build 1.8.0_192-20181024123616.buildslave.jdk8u-src-tar--b12)
GraalVM 1.0.0-rc12 (build 25.192-b12-jvmci-0.54, mixed mode)

real	0m3.133s
user	0m9.052s
sys	0m0.575s
 ~/graaldemo/examples/e01  ./hotspot_log.sh
openjdk version "1.8.0_192"
OpenJDK Runtime Environment (build 1.8.0_192-20181024123616.buildslave.jdk8u-src-tar--b12)
GraalVM 1.0.0-rc12 (build 25.192-b12-jvmci-0.54, mixed mode)

real	0m3.139s
user	0m9.456s
sys	0m0.566s
~/graaldemo/examples/e01  ls -al *.txt
-rw-r--r--  1 taewan  staff  44122 Feb 17 11:23 graal_log.txt
-rw-r--r--  1 taewan  staff    125 Feb 17 11:23 hotspot_log.txt
~/graaldemo/examples/e01  tail hotspot_log.txt
1 (286 ms)
2 (191 ms)
3 (158 ms)
4 (157 ms)
5 (162 ms)
6 (159 ms)
7 (163 ms)
8 (166 ms)
9 (165 ms)
total: 39999996 (1774 ms)
~/graaldemo/examples/e01  tail graal_log.txt
HotSpotCompilation-4644        Ljava/lang/Long;                                                       numberOfTrailingZeros                         (J)I                                                |    5ms   232B   180B
5 (204 ms)
HotSpotCompilation-4623        Ljava/lang/Integer;                                                    equals                                        (Ljava/lang/Object;)Z                               |    4ms    58B   171B
HotSpotCompilation-4627        Ljava/io/DataInputStream;                                              readFully                                     ([BII)V                                             |   13ms   330B  1017B
HotSpotCompilation-4610        Ljava/util/BitSet;                                                     clone                                         ()Ljava/lang/Object;                                |   23ms   692B  1105B
6 (131 ms)
7 (145 ms)
8 (108 ms)
9 (171 ms)
total: 39999996 (2912 ms)
~/graaldemo/examples/e01 
```
