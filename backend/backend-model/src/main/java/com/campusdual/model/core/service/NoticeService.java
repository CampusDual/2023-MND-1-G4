package com.campusdual.model.core.service;

import com.campusdual.api.core.service.INoticeService;

import com.campusdual.model.core.dao.*;
import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Lazy
@Service("NoticeService")
public class NoticeService implements INoticeService {

    @Autowired
    private NoticeDao noticeDao;

    @Autowired
    private DefaultOntimizeDaoHelper daoHelper;

    @Override
    public EntityResult noticeQuery(Map<String, Object> keysValues, List<String> attributes) throws OntimizeJEERuntimeException {
        return this.daoHelper.query(this.noticeDao, keysValues, attributes);
    }
    @Override
    public EntityResult noticeInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException {
        return this.daoHelper.insert(this.noticeDao, attrMap);
    }
    @Override
    public EntityResult noticeUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
            throws OntimizeJEERuntimeException {
        return this.daoHelper.update(this.noticeDao, attrMap, keyMap);
    }
    @Override
    public EntityResult noticeDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
        return this.daoHelper.delete(this.noticeDao, keyMap);
    }
}
