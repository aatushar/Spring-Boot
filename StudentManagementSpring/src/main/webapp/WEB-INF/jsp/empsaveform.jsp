<%@taglib prefix="f"  uri="http://www.springframework.org/tags/form"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">

    </head>
    <body>
        <h1>Student Save From</h1>


        <f:form method="post" action="/empsave"  modelAttribute="student">
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
                            <input class="btn btn-success" type="submit" value="Save"/>
                        </td>
                    </tr>
                  
                </table>
        </f:form>




    </body>
    

</html>
