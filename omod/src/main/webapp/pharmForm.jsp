<%@ include file="/WEB-INF/template/include.jsp"%>
<%@ include file="/WEB-INF/template/header.jsp"%>
<h2><spring:message code="Patients in System" /></h2>
<br/>
<table>
    <tr>
        <th>Patient Id</th>
        <th>Name</th>
        <th>Identifier</th>
        <th>Gender</th>
        <th>Note</th>
    </tr>
    <c:forEach var="patient" items="${thePatientNoteList.patients}">
        <tr>
            <td>${patient.patientId}</td>
            <td>${patient.personName}</td>
            <!-- attributes are found as getters in given classes e.g. person class-->
            <td>${patient.patientIdentifier}</td>
            <td>
                <c:choose>
                    <c:when test="${patient.gender == 'F'}">
                        Female
                    </c:when>
                    <c:otherwise>
                        Male
                    </c:otherwise>
                </c:choose>
            </td>
            <td>
                <c:forEach var="note" items="${thePatientNoteList.notes}">
                    <c:choose>
                        <c:when test="${note.patient.patientId == patient.patientId}">
                            ${note.text} <br>
                        </c:when>
                    </c:choose>
                </c:forEach>
            </td>
            <!--For attributes see package org.openmrs.web.dwr.PersonListItem.java     -->
            <
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
