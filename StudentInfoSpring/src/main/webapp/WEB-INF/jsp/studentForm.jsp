<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    

<h1>Add New Employee</h1>  
<form:form method="post" action="/save" modelAttribute="student">    
    <table >  
        
         <tr>    
            <td>Roll : </td>   
            <td><form:input path="roll"  /></td>  
        </tr> 
        <tr>    
            <td>Name : </td>   
            <td><form:input path="name"  /></td>  
        </tr>    
        <tr>    
            <td>Email :</td>    
            <td><form:input path="email" /></td>  
        </tr>   
          
        <tr>    
            <td>Gender :</td>    
            <td><form:input path="gender" /></td>  
        </tr>
       
        <tr>    
            <td>Hobby :</td>    
            <td><form:input path="hobby" /></td>  
        </tr>
        <tr>    
            <td>DoB :</td>    
            <td><form:input path="dob" /></td>  
        </tr>
        <tr>
            <td> </td>    
            <td><input type="submit" value="Save" /></td>    
        </tr>    
    </table>    
</form:form>  