java -version
javac CountUppercase.java
native-image -H:Name=countUppercase --no-server CountUppercase
ls
time ./countUppercase Welcome to Oracle Developer World!
