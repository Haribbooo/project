/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.83
 * Generated at: 2023-12-18 09:36:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.event;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class eventlist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=EUC-KR");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"EUC-KR\">\r\n");
      out.write("<title>이벤트 목록</title>\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@300;400;700&display=swap\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("   font-family: '맑은 고딕', 'Malgun Gothic', Arial, sans-serif;\r\n");
      out.write("   margin: 0;\r\n");
      out.write("   padding: 0;\r\n");
      out.write("   background-color: #f4f4f4;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("header {\r\n");
      out.write("   background-color: #333;\r\n");
      out.write("   color: #fff;\r\n");
      out.write("   text-align: center;\r\n");
      out.write("   padding: 1em;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("main {\r\n");
      out.write("   margin: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".event {\r\n");
      out.write("   border: 1px solid #ddd;\r\n");
      out.write("   background-color: #fff;\r\n");
      out.write("   margin-bottom: 20px;\r\n");
      out.write("   padding: 15px;\r\n");
      out.write("   border-radius: 5px;\r\n");
      out.write("   display: flex;\r\n");
      out.write("   flex-direction: row;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h2 {\r\n");
      out.write("   margin-top: 20px;\r\n");
      out.write("   color: #333;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".event-text {\r\n");
      out.write("   margin-left: 30px;\r\n");
      out.write("   flex: 1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("p {\r\n");
      out.write("   margin-top: 10px;\r\n");
      out.write("   color: #666;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".event img {\r\n");
      out.write("   width: 200px;\r\n");
      out.write("   height: 130px;\r\n");
      out.write("   border-radius: 5px;\r\n");
      out.write("   margin-bottom: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a {\r\n");
      out.write("   \r\n");
      out.write("   color: #007BFF;\r\n");
      out.write("   text-decoration: none;\r\n");
      out.write("   font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a:hover {\r\n");
      out.write("   text-decoration: underline;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("   ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("   <header>\r\n");
      out.write("      <h1>이벤트 목록</h1>\r\n");
      out.write("   </header>\r\n");
      out.write("\r\n");
      out.write("   <main>\r\n");
      out.write("      <div class=\"event\">\r\n");
      out.write("         <a href=\"../event/event_page3.jsp\"><img src=\"../resources/images/겨울섬mini.png\" alt=\"이벤트 1 이미지\"></a>\r\n");
      out.write("         <div class=\"event-text\">\r\n");
      out.write("            <a href=\"../event/event_page3.jsp\"><h2>2023 찾아가고 싶은 겨울X섬 인증샷 이벤트</h2></a>\r\n");
      out.write("            <p>2023. 12. 1.~2024. 2. 4.</p>\r\n");
      out.write("         </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"event\">\r\n");
      out.write("         <a href=\"../event/event_page2.jsp\"><img src=\"../resources/images/랭킹전.png\" alt=\"이벤트 2 이미지\"></a>\r\n");
      out.write("         <div class=\"event-text\">\r\n");
      out.write("            <a href=\"../event/event_page2.jsp\"><h2>발도장-콕 이벤트 12월 특별편 (feat.랭킹전)</h2></a>\r\n");
      out.write("            <p>2023. 12. 6.~2023. 12. 17.</p>\r\n");
      out.write("         </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"event\">\r\n");
      out.write("         <a href=\"../event/event_page1.jsp\"><img src=\"../resources/images/event_img11.png\" alt=\"이벤트 3 이미지\"></a>\r\n");
      out.write("         <div class=\"event-text\">\r\n");
      out.write("            <a href=\"../event/event_page1.jsp\"><h2>디지털 관광주민증과 함께 여행이 있는 주말, 혜택 더 있는 주말!</h2></a>\r\n");
      out.write("            <p>2023. 12. 1.~2024. 2. 4.</p>\r\n");
      out.write("         </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"event\">\r\n");
      out.write("         <a href=\"../event/event_page6.jsp\"><img src=\"../resources/images/트리2.png\" alt=\"이벤트 4 이미지\"></a>\r\n");
      out.write("         <div class=\"event-text\">\r\n");
      out.write("            <a href=\"../event/event_page6.jsp\"><h2>크리스마스 축제 기간 응모 이벤트!</h2></a>\r\n");
      out.write("            <p>2023. 12. 23.~2023. 12. 25.</p>\r\n");
      out.write("         </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"event\">\r\n");
      out.write("         <a href=\"../event/event_page3.jsp\"><img src=\"../resources/images/겨울섬mini.png\" alt=\"이벤트 1 이미지\"></a>\r\n");
      out.write("         <div class=\"event-text\">\r\n");
      out.write("            <a href=\"../event/event_page3.jsp\"><h2>2023 찾아가고 싶은 겨울X섬 인증샷 이벤트</h2></a>\r\n");
      out.write("            <p>2023. 12. 1.~2024. 2. 4.</p>\r\n");
      out.write("         </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"event\">\r\n");
      out.write("         <a href=\"../event/event_page2.jsp\"><img src=\"../resources/images/랭킹전.png\" alt=\"이벤트 2 이미지\"></a>\r\n");
      out.write("         <div class=\"event-text\">\r\n");
      out.write("            <a href=\"../event/event_page2.jsp\"><h2>발도장-콕 이벤트 12월 특별편 (feat.랭킹전)</h2></a>\r\n");
      out.write("            <p>2023. 12. 6.~2023. 12. 17.</p>\r\n");
      out.write("         </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"event\">\r\n");
      out.write("         <a href=\"../event/event_page1.jsp\"><img src=\"../resources/images/event_img11.png\" alt=\"이벤트 3 이미지\"></a>\r\n");
      out.write("         <div class=\"event-text\">\r\n");
      out.write("            <a href=\"../event/event_page1.jsp\"><h2>디지털 관광주민증과 함께 여행이 있는 주말, 혜택 더 있는 주말!</h2></a>\r\n");
      out.write("            <p>2023. 12. 1.~2024. 2. 4.</p>\r\n");
      out.write("         </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"event\">\r\n");
      out.write("         <a href=\"../event/event_page6.jsp\"><img src=\"../resources/images/트리2.png\" alt=\"이벤트 4 이미지\"></a>\r\n");
      out.write("         <div class=\"event-text\">\r\n");
      out.write("            <a href=\"../event/event_page6.jsp\"><h2>크리스마스 축제 기간 응모 이벤트!</h2></a>\r\n");
      out.write("            <p>2023. 12. 23.~2023. 12. 25.</p>\r\n");
      out.write("         </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("      <!-- 다른 이벤트들도 유사하게 추가할 수 있습니다. -->\r\n");
      out.write("\r\n");
      out.write("   </main>\r\n");
      out.write("   ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../footer.jsp", out, false);
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
