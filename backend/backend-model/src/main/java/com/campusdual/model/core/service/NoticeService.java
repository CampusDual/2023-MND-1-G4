package com.campusdual.api.core.service;

import com.ontimize.jee.common.dto.EntityResult;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class NoticeService implements INoticeService {

    @Override
    public EntityResult noticeQuery(Map<?, ?> keyMap, List<?> attrList) {
        // Lógica para consultar una novedad específica según la clave proporcionada
        return null; // Aquí deberías devolver el resultado de la consulta
    }

    @Override
    public EntityResult noticeAllQuery(Map<?, ?> keyMap, List<?> attrList) {
        // Lógica para consultar todas las novedades
        return null; // Devuelve el resultado de la consulta
    }

    @Override
    public EntityResult noticeInsert(Map<?, ?> attrMap) {
        // Lógica para insertar una nueva novedad con los atributos proporcionados
        return null; // Devuelve el resultado de la inserción
    }

    @Override
    public EntityResult noticeUpdate(Map<?, ?> attrMap, Map<?, ?> keyMap) {
        // Lógica para actualizar una novedad según los atributos y clave proporcionados
        return null; // Devuelve el resultado de la actualización
    }

    @Override
    public EntityResult noticeDelete(Map<?, ?> keyMap) {
        // Lógica para eliminar una novedad según la clave proporcionada
        return null; // Devuelve el resultado de la eliminación
    }
}
