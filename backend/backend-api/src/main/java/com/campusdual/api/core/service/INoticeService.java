package com.campusdual.api.core.service;

import com.ontimize.jee.common.dto.EntityResult;

import java.util.List;
import java.util.Map;

public interface INoticeService {
    public EntityResult noticeQuery(Map<?, ?> keyMap, List<?> attrList);
    public EntityResult noticeAllQuery(Map<?, ?> keyMap, List<?> attrList);
    public EntityResult noticeInsert(Map<?, ?> attrMap);
    public EntityResult noticeUpdate(Map<?, ?> attrMap, Map<?, ?> keyMap);
    public EntityResult noticeDelete(Map<?, ?> keyMap);
}