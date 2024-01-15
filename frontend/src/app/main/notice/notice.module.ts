import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { OntimizeWebModule } from 'ontimize-web-ngx';
import { NoticeRoutingModule } from './notice-routing.module';
import { NoticeHomeComponent } from './notice-home/notice-home.component';
import { NoticeNewComponent } from './notice-new/notice-new.component';

@NgModule({
  declarations: [NoticeHomeComponent, NoticeNewComponent],
  imports: [
    CommonModule,
    OntimizeWebModule,
    NoticeRoutingModule
  ]
})
export class NoticeModule { }
