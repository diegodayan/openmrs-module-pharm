/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm.db;

import org.openmrs.module.pharm.Users;

/**
 *
 * @author Yan
 */
public interface UsersDAO {
    
    public Users getUsers(Integer id);
    
    public Users saveUsers(Users users);
    
}
