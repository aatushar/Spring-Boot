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

    <f:form method="post" action="/editempsave" modelAttribute="student">

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
                    Department
                </td>
                <td>
                    <f:select path="department">
                        <f:option value="Accounting">Accounting</f:option>
                        <f:option value="Management">Management</f:option>
                        <f:option value="Marketing">Marketing</f:option>
                        <f:option value="Finance">Finance</f:option>
                    </f:select>
                </td>
            </tr>

            <tr>
                <td>
                    Gender
                </td>
                <td>
                    <f:radiobutton path="gender" value="Male" label="Male"></f:radiobutton>
                    <f:radiobutton path="gender" value="Female" label="Female"></f:radiobutton>
                </td>
            </tr>

            <tr>
                <td>
                    Marks
                </td>
                <td>
                    <f:input path="marks"></f:input>
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
