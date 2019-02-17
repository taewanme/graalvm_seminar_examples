rm -f *.class
java -version
javac CountUppercase.java
time java -XX:+UnlockExperimentalVMOptions \
-XX:+UseJVMCICompiler \
-XX:+EnableJVMCI -Dgraal.PrintCompilation=true CountUppercase Welcome to Oracle Developer World! > graal_log.txt
