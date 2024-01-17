package com.campusdual.model.core.dao;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

@Lazy
@Repository(value = "NoticeAdminDao")
@ConfigurationFile(configurationFile = "dao/NoticeAdminDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")

public class NoticeAdminDao extends OntimizeJdbcDaoSupport {

    public static final String ID = "NOTICE_ID";
    public static final String DESCRIPTION_SPANISH = "NOTICE_DESCRIPTION_SPANISH";
    public static final String TITLE_SPANISH = "NOTICE_SPANISH";
    public static final String DESCRIPTION_ENGLISH = "NOTICE_DESCRIPTION_ENGLISH";
    public static final String TITLE_ENGLISH = "NOTICE_TITLE_ENGLISH";
    public static final String DATE = "NOTICE_DATE";


}