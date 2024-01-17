package com.campusdual.model.core.service;

import com.campusdual.api.core.service.INoticeAdminService;
import com.campusdual.model.core.dao.NoticeAdminDao;
import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Lazy
@Service("NoticeAdminService")
public class NoticeAdminService implements INoticeAdminService {

    @Autowired
    private NoticeAdminDao noticeAdminDao;

    @Autowired
    private DefaultOntimizeDaoHelper daoHelper;

    @Override
    public EntityResult noticeAdminQuery(Map<String, Object> keysValues, List<String> attributes) throws OntimizeJEERuntimeException {
        return this.daoHelper.query(this.noticeAdminDao, keysValues, attributes);
    }
    @Override
    public EntityResult noticeAdminInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException {
        return this.daoHelper.insert(this.noticeAdminDao, attrMap);
    }
    @Override
    public EntityResult noticeAdminUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
            throws OntimizeJEERuntimeException {
        return this.daoHelper.update(this.noticeAdminDao, attrMap, keyMap);
    }
    @Override
    public EntityResult noticeAdminDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
        return this.daoHelper.delete(this.noticeAdminDao, keyMap);
    }
}
