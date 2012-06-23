package org.openmrs.module.pharm.db.hibernate;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.openmrs.Patient;
import org.openmrs.module.pharm.Note;
import org.openmrs.module.pharm.NoteService;
import org.openmrs.module.pharm.db.NoteDAO;

/**
 * This class should not be called directly. Instead, the {@link NoteService}
 * should be using this. A developer should do:
 * <code>
 *
 *   Context.getService(NoteService.class).saveNote(note)...
 *
 * </code>
 *
 */
public class HibernateNoteDAO implements NoteDAO {

    private SessionFactory sessionFactory;

    /**
     * This is a Hibernate object. It gives us metadata about the currently
     * connected database, the current session, the current db user, etc. To
     * save and get objects, calls should go through
     * sessionFactory.getCurrentSession() <br/> <br/> This is called by Spring.
     * See the /metadata/moduleApplicationContext.xml for the "sessionFactory"
     * setting. See the applicationContext-service.xml file in CORE openmrs for
     * where the actual "sessionFactory" object is first defined.
     *
     * @param sessionFactory
     */
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Note getNote(Integer id) {
        return (Note) sessionFactory.getCurrentSession().get(Note.class, id);
    }

    public Note getNoteByUuid(String uuid) {
        Criteria crit = sessionFactory.getCurrentSession().createCriteria(
                Note.class);
        crit.add(Restrictions.eq("uuid", uuid));
        return (Note) crit.uniqueResult();
    }

    public List<Note> getNotes(Patient patient) {
        Criteria crit = sessionFactory.getCurrentSession().createCriteria(
                Note.class);
        crit.add(Restrictions.eq("patient", patient));
        return crit.list();
    }

    public Note saveNote(Note note) {
        sessionFactory.getCurrentSession().saveOrUpdate(note);
        return note;
    }
}
