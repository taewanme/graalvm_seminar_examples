rm -f 1 hello.bc
clang -c -O1 -emit-llvm hello.c
lli hello.bc
