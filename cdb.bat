@ECHO OFF
REM save as 'cdb.bat'
SET CPATH=c:\classes

@ECHO ON
javac -d %CPATH% Test284.java

@ECHO OFF
SET CPATH=%CPATH%;c:\jars\mariadb-java-client-2.5.1.jar

@ECHO ON
java -classpath %CPATH% banana.%1