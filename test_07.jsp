<%@page import ="java.util.*, bang01.Bang01VO"%> <%

List<Bang01VO> ls = new ArrayList<Bang01VO>();
ls.add(new Bang01VO());
ls.add(new Bang01VO());
ls.add(new Bang01VO());
ls.add(new Bang01VO());

for (Bang01VO t : ls) {
	out.println(t.toString());
	out.println("<br/>");
}

%>