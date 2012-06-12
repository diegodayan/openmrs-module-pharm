<%@ include file="/WEB-INF/template/include.jsp"%>
<openmrs:htmlInclude file="/scripts/jquery/jquery.min.js" />
<openmrs:htmlInclude file="/dwr/engine.js" ></openmrs:htmlInclude>
<openmrs:htmlInclude file="/dwr/util.js" ></openmrs:htmlInclude>
<script src="<openmrs:contextPath/>/dwr/interface/DWRMyPharmDrugsService.js"></script>
<script src="<openmrs:contextPath/>/dwr/interface/DWRPatientService.js"></script>
<script>
    function pharmDrugsFound(drugs) {
        document.getElementById("name").innerHTML="barry"
        var master=document.getElementById("mylist")
        for (i=0; i<drugs.length; i++) {
            master.options[master.options.length]=new Option(drugs[i].title + " - " + drugs[i].text, "pharmDrug", false, false)
        }  
    }  
    function deletePharmDrugById(pharmDrugId, callback) {
        callback = callback || function(data) {alert("removed!"); console.log(data); };
        DWRMyPharmDrugsService.deletePharmDrugById(pharmDrugId, callback);
    }
    function createPharmDrugForPatient(patientId, callback) {
        callback = callback || function(data) {alert("created! I will try to refresh the page for you."); console.log(data); window.location.reload();};
        var title = document.getElementById("newPharmDrugTitle").value;
        var text = document.getElementById("newPharmDrugText").value;
        DWRMyPharmDrugsService.createPharmDrugForPatient(patientId, title, text, callback);
    }
</script>
<h2>PATIENT DRUGS</h2>
<c:if test="${fn:length(pharmDrugs) == 0}">
    No pharmDrugs - patientPharmDrugs.jsp
</c:if>
<hr />

<h3>Add new pharmDrug!</h3>
<input id="newPharmDrugTitle" value="" placeholder="Title"  />
<input id="newPharmDrugText" value="" placeholder="Text" />
<button type="button" onclick="createPharmDrugForPatient(${patient.patientId})">Save</button>
<hr />

<h3>List of existing pharmDrugs</h3>
<c:if test="${fn:length(pharmDrugs) == 0}">
    There are no pharmDrugs here!
</c:if>
<c:forEach var="pharmDrug" items="${pharmDrugs}">
    <div id="pharmDrugContainer-${pharmDrug.id}" style="border: 1px black solid; background-color: #ffff88; margin: 0.5em; width: 50%">
        <b><u>${pharmDrug.title}</u></b><br/>
        <span>${pharmDrug.text}</span><br/>
        <span>ID: ${pharmDrug.id}</span><br/>
        <span>UUID: ${pharmDrug.uuid}</span><br/>
        <a style="cursor:pointer;" onclick="this.disabled=true;deletePharmDrugById(${pharmDrug.id}, function(data){console.log('Removed', data); $j('#pharmDrugContainer-'+${pharmDrug.id}).css('background', 'red');})">Delete</a><br/>
    </div>
</c:forEach>
<br/>