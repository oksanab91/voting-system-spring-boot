<%-- 
    Document   : index
    Created on : Apr 21, 2018, 7:40:58 PM
    Author     : Oks
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>Voting System</title>
        </head>
        <body>
            <h1><h:outputText value="Hello Voting System!"/></h1>
            
            <div>
                <c:forEach var="entry" items="${sessionScope.breadcrumbs}" varStatus="status">
                    <c:choose>
                        <c:when test="${entry.url eq '#'}">
                            ${entry.name}
                        </c:when>
                        <c:otherwise>
                            <a href="${entry.url}">${entry.name}></a>
                        </c:otherwise>
                    </c:choose>
                </c:forEach>
                
            </div>
        </body>
    </html>
</f:view>
