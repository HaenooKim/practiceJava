REM save as c2.bat
javac -classpath c:\classes -d c:\classes %1.java
java -classpath c:\classes;c:\jars\mariadb-java-client-2.5.1.jar banana.%1