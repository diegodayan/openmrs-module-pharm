/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm;


//            CREATE TABLE `pharm_users` (
//            `id` int(11) NOT NULL,
//            `modified` char(1) DEFAULT NULL,
//            `cl_password` varchar(255) DEFAULT NULL,
//            `role` varchar(255) DEFAULT NULL,
//            `cl_username` varchar(255) DEFAULT NULL,
//            PRIMARY KEY (`id`)
//            ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/**
 *
 * @author Yan
 */
public class Users {
    
    private Integer id;
    private String modified;
    private String clPassword;
    private String role;
    private String clUsername;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the modified
     */
    public String getModified() {
        return modified;
    }

    /**
     * @param modified the modified to set
     */
    public void setModified(String modified) {
        this.modified = modified;
    }

    /**
     * @return the clPassword
     */
    public String getClPassword() {
        return clPassword;
    }

    /**
     * @param clPassword the clPassword to set
     */
    public void setClPassword(String clPassword) {
        this.clPassword = clPassword;
    }

    /**
     * @return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * @return the clUsername
     */
    public String getClUsername() {
        return clUsername;
    }

    /**
     * @param clUsername the clUsername to set
     */
    public void setClUsername(String clUsername) {
        this.clUsername = clUsername;
    }
    
}
