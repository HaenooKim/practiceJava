<%@page import = "java.util.*"%><%

try {
	Class.forName("org.mariadb.jdbc.Driver");
	out.println("driver Ok");
}
catch (Exception e) {
	out.println(e.toString());
}

%>

<%-- test_04.jsp
�� ������ �������� �����Ѵ�.
ROOT/WEB-INF/lib ������ ���� jars���Ͽ� �ִ� mariadb-java-client-2.5.1.jar�� �־��ش�.
���� �������� tomcat�� �� ������Ų��.

putty���� 
cd tomcat -> cd bin -> sh shutdown.tomcat -> sh startup.sh
--%>
