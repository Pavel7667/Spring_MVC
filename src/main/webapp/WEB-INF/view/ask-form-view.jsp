<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>

<body>


<h2> MVC ask_form_view </h2>

<br>
<br>

<%--    For active button go to URL showDetails  --%>
<%--    And new URL catch Controller   --%>
<form action="showDetails" method="get">
    <%--    Save input text into link = someLink   --%>
    <input type="text" name="someLink"
    <%--    Some txt to descibe field   --%>
           placeholder="Write some text"/>

    <%--Button--%>
    <input type="submit"/>

</form>


</body>

</html>