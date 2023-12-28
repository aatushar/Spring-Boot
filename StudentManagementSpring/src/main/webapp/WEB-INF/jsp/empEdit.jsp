<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>   

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
         <f:form method="post" action="/editempsave"  modelAttribute="student">
                         
             <f:hidden  path="id" />
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
                        <f:input path="department"></f:input>
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
                            <input  type="submit" value="Save"/>
                        </td>
                    </tr>
                  
                </table>
        </f:form>

        
    </body>
</html>
