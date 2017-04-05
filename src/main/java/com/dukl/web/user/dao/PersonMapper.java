package com.dukl.web.user.dao;

import com.dukl.web.user.model.PersonEntity;

/**
 * Created by Administrator on 2017/4/5.
 */
public interface PersonMapper {
    PersonEntity obtainPersonById(String pId);
}
