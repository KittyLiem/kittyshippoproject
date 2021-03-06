<%@ include file="/WEB-INF/jsp/include/imports.jsp" %>

<%--@elvariable id="item" type="org.example.beans.NewsDocument"--%>
<%--@elvariable id="query" type="java.lang.String"--%>
<%--@elvariable id="pageable" type="org.onehippo.cms7.essentials.components.paging.Pageable"--%>
<c:choose>
  <c:when test="${not empty requestScope.pageable}">
    <c:choose>
      <c:when test="${requestScope.pageable.total == 0}">
        <h3>No results for: <c:out value="${requestScope.query}"/></h3>
      </c:when>
      <c:otherwise>
        <c:forEach var="item" items="${requestScope.pageable.items}" varStatus="status">
          <c:choose>
            <c:when test="${hst:isReadable(item, 'title')}">
              <c:set var="linkName" value="${item.title}"/>
            </c:when>
            <c:otherwise>
              <c:set var="linkName" value="${item.localizedName}"/>
            </c:otherwise>
          </c:choose>

          <article>
            <hst:cmseditlink hippobean="${item}"/>
            <hst:link var="link" hippobean="${item}"/>
            <h3><a href="${link}"><c:out value="${linkName}"/></a></h3>
          </article>
        </c:forEach>
        <c:if test="${requestScope.cparam.showPagination}">
          <%@ include file="/WEB-INF/jsp/include/pagination.jsp" %>
        </c:if>
      </c:otherwise>
    </c:choose>
  </c:when>
  <c:otherwise>
    <h3>Please fill in a search term.</h3>
  </c:otherwise>
</c:choose>
