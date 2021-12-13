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
이 파일은 서버에서 동작한다.
ROOT/WEB-INF/lib 폴더를 만들어서 jars파일에 있는 mariadb-java-client-2.5.1.jar를 넣어준다.
넣은 다음에는 tomcat을 재 가동시킨다.

putty에서 
cd tomcat -> cd bin -> sh shutdown.tomcat -> sh startup.sh
--%>
