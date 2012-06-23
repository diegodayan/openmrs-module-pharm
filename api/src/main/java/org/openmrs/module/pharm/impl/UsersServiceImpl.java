/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm.impl;

import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.pharm.Users;
import org.openmrs.module.pharm.UsersService;
import org.openmrs.module.pharm.db.UsersDAO;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Yan
 */
public class UsersServiceImpl extends BaseOpenmrsService implements UsersService{
    
        /**
     * This "dao" object is set by spring. See the
     * /metadata/moduleApplicationContext.xml for what value gets set here. We
     * can assume that this will never be null, even though it never gets set in
     * here. This is called Inversion of Control (IoC)
     */
    private UsersDAO dao;

    /**
     * This is the method that spring calls to set the DAO
     *
     * @param dao the dao to set
     */
    public void setDao(UsersDAO dao) {
        this.dao = dao;
    }

    /**
     * @see
     * org.openmrs.module.patientnotes.NoteService#getNote(java.lang.Integer)
     */
    @Transactional(readOnly = true)
    public Users getUsers(Integer id) {
        return dao.getUsers(id);
    }

    @Transactional
    public Users saveUsers(Users users) {
        return dao.saveUsers(users);
    }
    
}
