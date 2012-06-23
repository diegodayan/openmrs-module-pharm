<%@ include file="/WEB-INF/template/include.jsp"%>
<openmrs:htmlInclude file="/scripts/jquery/jquery.min.js" />
<openmrs:htmlInclude file="/dwr/engine.js" ></openmrs:htmlInclude>
<openmrs:htmlInclude file="/dwr/util.js" ></openmrs:htmlInclude>
<script src="<openmrs:contextPath/>/dwr/interface/DWRPatientService.js"></script>
<script src="<openmrs:contextPath/>/dwr/interface/DWRPrescriptionService.js"></script>

<h2>Prescriptions</h2>
<c:if test="${fn:length(prescriptions) == 0}">
    There are no prescriptions for this patient.
</c:if>
<c:if test="${fn:length(prescriptions) > 0}">
    <table>
        <th>Prescription ID</th>
        <th>Date</th>
        <th>Notes</th>
        <th>Patient ID</th>
        <c:forEach var="prescription" items="${prescriptions}">
            <tr>
                <td>${prescription.id}</td>
                <td>${prescription.date}</td>
                <td>${prescription.notes}</td>
                <td>${prescription.patient}</td>
            </tr>
        </c:forEach>
    </table>
</c:if>
<br/>
