<%@ page import="org.apache.pluto.core.Environment"%>
 <%--
Copyright 2004 The Apache Software Foundation.
Licensed  under the  Apache License,  Version 2.0  (the "License");
you may not use  this file  except in  compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed  under the  License is distributed on an "AS IS" BASIS,
WITHOUT  WARRANTIES OR CONDITIONS  OF ANY KIND, either  express  or
implied.

See the License for the specific language governing permissions and
limitations under the License.
--%>
<table>
  <tr><th><img src="http://portals.apache.org/pluto/images/pluto.png"/></th></tr>
  <tr class="banner"><td>Pluto Portal Driver <FONT class="small">(<%=Environment.getServerInfo()%>)</FONT></td>
      <td align="right"><A href="<%=request.getContextPath()%>/login_success.jsp">Login</A></td>
  </tr>
</table>
<br>
