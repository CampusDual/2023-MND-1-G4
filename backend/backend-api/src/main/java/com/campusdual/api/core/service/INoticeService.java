package com.campusdual.api.core.service;

import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;

import java.util.List;
import java.util.Map;

public interface INoticeService {
    EntityResult noticeQuery(Map<String, Object> keysValues, List<String> attributes) throws OntimizeJEERuntimeException;

    EntityResult noticeInsert(Map<String, Object> attributes) throws OntimizeJEERuntimeException;

    EntityResult noticeUpdate(Map<String, Object> attributes, Map<String, Object> KeyValues) throws OntimizeJEERuntimeException;

    EntityResult noticeDelete(Map<String, Object> keyValues) throws OntimizeJEERuntimeException;

}