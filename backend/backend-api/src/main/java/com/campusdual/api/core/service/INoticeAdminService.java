package com.campusdual.api.core.service;

import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;

import java.util.List;
import java.util.Map;

public interface INoticeAdminService {
    EntityResult noticeAdminQuery(Map<String, Object> keysValues, List<String> attributes) throws OntimizeJEERuntimeException;

    EntityResult noticeAdminInsert(Map<String, Object> attributes) throws OntimizeJEERuntimeException;

    EntityResult noticeAdminUpdate(Map<String, Object> attributes, Map<String, Object> KeyValues) throws OntimizeJEERuntimeException;

    EntityResult noticeAdminDelete(Map<String, Object> keyValues) throws OntimizeJEERuntimeException;

}