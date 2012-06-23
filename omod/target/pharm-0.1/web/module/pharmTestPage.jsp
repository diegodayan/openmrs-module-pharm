<%@ include file="/WEB-INF/template/include.jsp"%>
<%@ include file="/WEB-INF/template/header.jsp"%>
<h2><spring:message code="Patients in System" /></h2>
<br/>
<h2>${data.message}</h2>
<table>    
    <tr>
        <th>Id</th>
        <th>countdate</th>
        <th>adherenceReason</th>
    </tr>
    <c:forEach var="art" items="${data.adherenceRecords}">
        <tr>
            <td>${art.id}</td>
            <td>${art.countDate}</td>
            <td>${art.adherenceReason}</td>
        </tr>		
    </c:forEach>

</table>

<!-- This will do an HTTP "post" to the "addNote.form" (defined in PatientNotesController.java), giving it the current "patient_id" form -->
<form method="post" action="addNote.form">
    <input type="hidden" name="patient_id" value="2"/>
    Title: <input type="text" name="title"/><br/>
    Text: <input type="text" name="text"/><br/>
    <input type="submit" value="Add Note"/>
</form>

<%@ include file="/WEB-INF/template/footer.jsp"%>
