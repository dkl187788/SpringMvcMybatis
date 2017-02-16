package com.dukl.web.user.dao;

import com.dukl.web.user.model.UserEntry;

/**
 * Created by adudu on 2017/2/12.
 */
public interface UserMapper {

    public UserEntry obtainUserEntryById(int userId);

}
