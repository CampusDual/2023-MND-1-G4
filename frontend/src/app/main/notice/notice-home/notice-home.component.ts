import { Component, OnInit } from '@angular/core';
import { OntimizeService } from 'ontimize-web-ngx';

@Component({
  selector: 'app-notice-home',
  templateUrl: './notice-home.component.html',
  styleUrls: ['./notice-home.component.css']
})
export class NoticeHomeComponent implements OnInit {

  constructor(private ontimizeService: OntimizeService) {}

  ngOnInit() {
    this.loadNoticeData();
  }

  loadNoticeData(): void {
    this.ontimizeService.configureService('notice');
    this.ontimizeService.query().subscribe
  }
}