<%@ include file="/WEB-INF/template/include.jsp"%>

<openmrs:htmlInclude file="/scripts/jquery/jquery.min.js" />
<openmrs:htmlInclude file="/dwr/engine.js" ></openmrs:htmlInclude>
<openmrs:htmlInclude file="/dwr/util.js" ></openmrs:htmlInclude>
<script src="<openmrs:contextPath/>/dwr/interface/DWRMyNotesService.js"></script>
<script src="<openmrs:contextPath/>/dwr/interface/DWRPatientService.js"></script>

<h2>PATIENT NOTES</h2>
<c:if test="${fn:length(notes) == 0}">
    No notes - patientnotes.jsp
</c:if>

<c:forEach var="note" items="${notes}">
    <div style="border: 1px black solid; background-color: #ffff88; margin: 0.5em; width: 50%">
        <b><u>${note.title}</u></b><br/>
        ${note.text}
    </div>
</c:forEach>

<br/>
