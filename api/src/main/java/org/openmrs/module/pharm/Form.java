package org.openmrs.module.pharm;

import org.openmrs.BaseOpenmrsData;

// CREATE TABLE `pharm_form` (
//   `id` int(4) NOT NULL AUTO_INCREMENT,
//   `form` varchar(255) DEFAULT NULL,
//   `actionlanguage1` varchar(255) DEFAULT NULL,
//   `actionlanguage2` varchar(255) DEFAULT NULL,
//   `actionlanguage3` varchar(255) DEFAULT NULL,
//   `formlanguage1` varchar(255) DEFAULT NULL,
//   `formlanguage2` varchar(255) DEFAULT NULL,
//   `formlanguage3` varchar(255) DEFAULT NULL,
//   `dispinstructions1` varchar(255) DEFAULT NULL,
//   `dispinstructions2` varchar(255) DEFAULT NULL,
//   PRIMARY KEY (`id`)
// ) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;
/**
 *
 * 
 */
public class Form extends BaseOpenmrsData {

    private Integer id;
    private String form;
    private String actionLanguage1;
    private String actionLanguage2;
    private String actionLanguage3;
    private String formLanguage1;
    private String formLanguage2;
    private String formLanguage3;    
    private String dispInstructions1;
    private String dispInstructions2;
    
    public Form() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }    
    
    public String getActionLanguage1() {
        return actionLanguage1;
    }

    public void setActionLanguage1(String actionLanguage1) {
        this.actionLanguage1 = actionLanguage1;
    }
    
    public String getActionLanguage2() {
        return actionLanguage2;
    }

    public void setActionLanguage2(String actionLanguage2) {
        this.actionLanguage2 = actionLanguage2;
    }
    
    public String getActionLanguage3() {
        return actionLanguage3;
    }

    public void setActionLanguage3(String actionLanguage3) {
        this.actionLanguage3 = actionLanguage3;
    }
        
    public String getFormLanguage1() {
        return formLanguage1;
    }

    public void setFormLanguage1(String formLanguage1) {
        this.formLanguage1 = formLanguage1;
    }
    
    public String getFormLanguage2() {
        return formLanguage2;
    }

    public void setFormLanguage2(String formLanguage2) {
        this.formLanguage2 = formLanguage2;
    }
    
    public String getFormLanguage3() {
        return formLanguage3;
    }

    public void setFormLanguage3(String formLanguage3) {
        this.formLanguage3 = formLanguage3;
    }
    
    public String getDispInstructions1() {
        return dispInstructions1;
    }

    public void setDispInstructions1(String dispInstructions1) {
        this.dispInstructions1 = dispInstructions1;
    }
    
    public String getDispInstructions2() {
        return dispInstructions2;
    }

    public void setDispInstructions2(String dispInstructions2) {
        this.dispInstructions2 = dispInstructions2;
    }
}
