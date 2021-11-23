@ECHO OFF
REM c.bat



@ECHO ON
javac -d c:/classes %1.java
java -classpath c:/classes banana.%1