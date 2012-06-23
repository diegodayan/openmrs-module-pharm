<ul class="navList">	
 
     <openmrs:hasPrivilege privilege="View Patients">
         <openmrs:hasPrivilege privilege="Pharm add prescription">
	<li id="findPatientNavLink">
<!--
		< a href="$ {pageContext.request.contextPath}/findPatient.htm">
	              View Patients
		</a>

 -->
            <a href="pharmDispenseReturnPrescriptions.htm"><spring:message code="pharm.pres" /></a> 
	</li>
        </openmrs:hasPrivilege>
        </openmrs:hasPrivilege>

        <li>
            <a href="pharmDispenseReturnPrescriptionsWithDWR.htm"><spring:message code="Dispense and Return Prescriptions With DWR" /></a>
        </li>        
        <li>
            <a href="pharmDispenseReturnPrescriptions.htm"><spring:message code="pharm.invmgmt" /></a>
        </li>
        <li>
            <a href="pharmDispenseReturnPrescriptions.htm">Admin</a>
        </li>        
	<openmrs:hasPrivilege privilege="Pharm add prescription">
		<li id="adminNavLink">
			<a href="${pageContext.request.contextPath}/admin">OpemMRS Admin</a>
		</li>
	</openmrs:hasPrivilege>


	
</ul>