package com.campusdual.ws.core.rest;

import com.campusdual.api.core.service.INoticeService;
import com.ontimize.jee.server.rest.ORestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notice")
public class NoticeRestController extends ORestController<INoticeService> {

    @Autowired
    private INoticeService noticeService;
    @Override
    public INoticeService getService(){
        return this.noticeService;
    }
}