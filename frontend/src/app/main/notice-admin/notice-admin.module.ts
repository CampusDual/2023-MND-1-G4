import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { OntimizeWebModule } from 'ontimize-web-ngx';
import { NoticeAdminRoutingModule } from './notice-admin-routing.module';
import { NoticeAdminHomeComponent } from './notice-admin-home/notice-admin-home.component';
import { NoticeAdminNewComponent } from './notice-admin-new/notice-admin-new.component';

@NgModule({
  declarations: [NoticeAdminHomeComponent, NoticeAdminNewComponent],
  imports: [
    CommonModule,
    OntimizeWebModule,
    NoticeAdminRoutingModule
  ]
})
export class NoticeAdminModule { }
