<%@ include file="/WEB-INF/template/include.jsp"%>

<openmrs:htmlInclude file="/scripts/jquery/jquery.min.js" />
<openmrs:htmlInclude file="/dwr/engine.js" ></openmrs:htmlInclude>
<openmrs:htmlInclude file="/dwr/util.js" ></openmrs:htmlInclude>
<script src="<openmrs:contextPath/>/dwr/interface/DWRMyNotesService.js"></script>
<script src="<openmrs:contextPath/>/dwr/interface/DWRMyPharmDrugsService.js"></script>
<script src="<openmrs:contextPath/>/dwr/interface/DWRPatientService.js"></script>

<h2><spring:message code="Example Patient Portlet Tab Without Controller" /></h2>

<script>
    function changeList() {
        DWRPatientService.findPatients("John", false, objectsFound);
        //Control can't reach here - the last statement executed is the callback
        //DWRMyNotesService.getNotesForPatient("John",patientFound);
    }
    function objectsFound(patients) {
        var master=document.getElementById("mylist")
        master.options.length=0
        master.options[0]=new Option("Sports", "sportsvalue", true, false)
        master.options[1]=new Option("Music", "musicvalue", false, false)
        master.options[2]=new Option("Movies", "moviesvalue", false, false)

        for (i=0; i<patients.length; i++){
            master.options[master.options.length]=new Option(patients[i].personName, "numpatients", false, false)
        }

        document.getElementById("name").innerHTML=patients[0].personName
        document.getElementById("age").innerHTML=patients[0].birthdate
        DWRMyNotesService.getNotesForPatient("John",patientFound);
        DWRMyPharmDrugsService.getPharmDrugsForPatient("John",pharmDrugsFound);
    }
    function patientFound(notes) {
        document.getElementById("name").innerHTML="barry"
        var master=document.getElementById("mylist")
        for (i=0; i<notes.length; i++) {
            master.options[master.options.length]=new Option(notes[i].text, "note", false, false)
        }  
    } 
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
    
</script>
<select id="mylist">
    <option value="volvo">Volvo</option>
    <option value="saab">Saab</option>
    <option value="mercedes">Mercedes</option>
    <option value="audi">Audi</option>
</select>
<table border="0">
    <tr>
        <th ALIGN=LEFT>Patient Name</th>
        <th id="name" ALIGN=LEFT> </th>
    </tr> 
    <tr>
        <th ALIGN=LEFT>Patient Age</th>
        <th id="age" ALIGN=LEFT> </th>
    </tr>
    <tr>
        <th ALIGN=LEFT>Patient Weight</th>
        <th id="weight" ALIGN=LEFT> </th>
    </tr>
</table> 

<button onclick="changeList()">Change List</button>
<a href="../openmrs/module/pharm/pharmLink.form">Pharmacist Screen</a> 
<br> <br>


<br />
<input type="text" id="pharmDrugIdToBeDeleted" value=""/>
<button onclick="deletePharmDrugById(document.getElementById('pharmDrugIdToBeDeleted').value)">Delete pharm drug</button>



