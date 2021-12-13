<%@page import = "java.util.*"%><%
	List<String> l = new ArrayList<String>();
	l.add("apple");
	l.add("banana");
	l.add("orange");
	
	for (String t: l) {
		out.println(t);
		out.println("<br/>");
	}

%>
