package com.campusdual.ws.core.rest;

import com.campusdual.api.core.service.INoticeAdminService;
import com.ontimize.jee.server.rest.ORestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/noticeAdmin")
public class NoticeAdminRestController extends ORestController<INoticeAdminService> {

    @Autowired
    private INoticeAdminService noticeAdminService;
    @Override
    public INoticeAdminService getService(){
        return this.noticeAdminService;
    }
}