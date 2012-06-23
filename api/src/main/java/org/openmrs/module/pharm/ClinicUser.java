package org.openmrs.module.pharm;

import org.openmrs.BaseOpenmrsData;
import org.openmrs.User;
// CREATE TABLE `pharm_clinicuser` (
//   `clinicid` int(11) NOT NULL,
//   `userid` int(11) NOT NULL,
//   PRIMARY KEY (`userid`,`clinicid`),
//   UNIQUE KEY `pharm_unique_clinicuser` (`userid`,`clinicid`)
// ) ENGINE=InnoDB DEFAULT CHARSET=utf8$$
public class ClinicUser extends BaseOpenmrsData {

    private Integer id;
    private User user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
