package com.campusdual.model.core.dao;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

@Lazy
@Repository(value = "NoticeDao")
@ConfigurationFile(configurationFile = "dao/NoticeDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")

public class NoticeDao extends OntimizeJdbcDaoSupport {

    public static final String ID = "ID";
    public static final String USERID = "USER_";
    public static final String SID= "S_ID";
    public static final String NDESCRIPTION = "N_DESCRIPTION";
    public static final String NTITULO = "N_TITULO";
    public static final String NFECHA = "N_FECHA";
}