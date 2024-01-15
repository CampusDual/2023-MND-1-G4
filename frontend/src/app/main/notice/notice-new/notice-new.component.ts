import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-notice-new',
  templateUrl: './notice-new.component.html',
  styleUrls: ['./notice-new.component.css']
})
export class NoticeNewComponent implements OnInit {
  

  constructor() { }

  ngOnInit() {
  }

  getDataArray() {
    const array: Array<Object> = [];
    array.push({
      'key': 1,
      'value': 'Spanish'
    });
    array.push({
      'key': 2,
      'value': 'English'
    });
    return array;
  }

  getValue() {
    return 2;
  }

}



