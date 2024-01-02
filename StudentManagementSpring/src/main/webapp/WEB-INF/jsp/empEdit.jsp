<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    <h1>Hello World!</h1>

    <f:form method="post" action="/producteditsave" modelAttribute="product">

        <f:hidden path="id" />
        <table class="table table-striped">
            <tr>
                <td>
                    Name
                </td>
                <td>
                    <f:input path="name"></f:input>
                </td>
            </tr>

            <tr>
                <td>
                    Price
                </td>
                <td>
                    <f:input path="price"></f:input>
                </td>
            </tr>

            <tr>
                <td>
                    Quantity
                </td>
                <td>
                    <f:input path="quantity"></f:input>
                </td>
            </tr>

            <tr>
                <td>
                    Brand
                </td>
                <td>
                    <f:select path="brand">
                        <f:option value="Samsung">Samsung</f:option>
                        <f:option value="OnePlus">OnePlus</f:option>
                        <f:option value="Xiaomi">Xiaomi</f:option>
                        <f:option value="Apple">Apple</f:option>
                    </f:select>
                </td>
            </tr>

            <tr>
                <td>
                    <input type="submit" value="Save" />
                </td>
            </tr>
        </table>
    </f:form>

</body>
</html>
