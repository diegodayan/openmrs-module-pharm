<!-- Contains imports for taglibs so we can do c:if, etc -->
<%@ include file="/WEB-INF/template/include.jsp" %>

<!-- The openmrs "look and feel" -->
<%@ include file="/WEB-INF/template/header.jsp" %>

<h2>Existing Drugs</h2>

<!-- Our controller (PatientNotesController.java) make a "pharmDrugs" variable available to us.  This is a list of "PharmDrug" objects -->
<c:if test="${fn:length(pharmDrugs) == 0}">
    <!-- There are no notes in the "notes" variable -->
    None
</c:if>

<!-- Loop over the notes and print them out. -->
<c:forEach var="pharmDrug" items="${pharmDrug}">
    <div style="border: 1px black solid">
        <u>${pharmDrug.title}</u><br/>
        ${pharmDrug.text}
    </div>
</c:forEach>

<h2>Add another pharm drug</h2>

<!-- This will do an HTTP "post" to the "addNote.form" (defined in PatientNotesController.java), giving it the current "patient_id" form -->
<form method="post" action="addNote.form">
    <input type="hidden" name="patient_id" value="${patient.patientId}"/>
    Title: <input type="text" name="title"/><br/>
    Text: <input type="text" name="text"/><br/>
    <input type="submit" value="Add Note"/>
</form>

<!-- The openmrs "look and feel" -->
<%@ include file="/WEB-INF/template/footer.jsp" %>