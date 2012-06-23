<%@ include file="/WEB-INF/template/include.jsp"%>

<openmrs:htmlInclude file="/scripts/jquery/jquery.min.js" />
<openmrs:htmlInclude file="/dwr/engine.js" ></openmrs:htmlInclude>
<openmrs:htmlInclude file="/dwr/util.js" ></openmrs:htmlInclude>
<script src="<openmrs:contextPath/>/dwr/interface/DWRSaveNoteBL.js"></script>



<h2><spring:message code="Patient Regimens" /></h2>
<script type="text/javascript">
	var $j = jQuery.noConflict();  
        // noConflict forces use of $j; otherwise the use of $ might conflict with javascript

	$j(document).ready(function(){
		$j('#addNote').click(function(){
                    pat = ${patient.patientId} + 1
			DWRSaveNoteBL.saveNoteForPatient($j('#patientId').val(), $j('#title').val(), $j('#text').val(), function(ret){
                               alert(ret)
	   		});
   		});	
        })

</script>
<div>
note:  the name of this file is the same name as the portlet that we're overriding in core.
<br/>

<br/>
Patient: ${patient.patientId} <br>
	<input type="hidden" id="patientId" name="patient_id" value="${patient.patientId}"/>
	Title: <input type="text" id="title" name="title"/><br/>
	Text: <input type="text" id="text" name="text"/><br/>
	<input type="button" id="addNote" value="Add Note"/>        


<br><br><br>
</div>
<br> <br>
