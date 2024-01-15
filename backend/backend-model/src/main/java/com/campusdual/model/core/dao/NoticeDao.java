package com.campusdual.model.core.dao;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

@Lazy
@Repository(value = "NoticeDao")
@ConfigurationFile(configurationFile = "dao/NoticeDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")

public class NoticeDao extends OntimizeJdbcDaoSupport {

    public static final String ID = "NOTICE_ID";
    public static final String DESCRIPTION = "NOTICE_DESCRIPTION";
    public static final String TITLE = "NOTICE_TITLE";

}