package com.campusdual.model.core.dao;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

@Repository(value = "SubscriptionDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/SubscriptionDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class SubscriptionDao extends OntimizeJdbcDaoSupport {
    public static final String ID = "SUBS_ID";
    public static final String FREQUENCY = "FR_ID";
    public static final String ACTIVE = "SUBS_AUTORENEWAL";
    public static final String PLATF_ID = "PLATF_ID";
    public static final String USER = "USER_";
}
