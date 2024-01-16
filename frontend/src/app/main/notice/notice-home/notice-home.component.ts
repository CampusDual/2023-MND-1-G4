import { Component, OnInit } from '@angular/core';
import { DomSanitizer } from '@angular/platform-browser';
import { OListComponent, OTranslateService, OntimizeService } from "ontimize-web-ngx";


@Component({
  selector: 'app-notice-home',
  templateUrl: './notice-home.component.html',
  styleUrls: ['./notice-home.component.css']
})
export class NoticeHomeComponent implements OnInit {

  idiomaActual: string;

  constructor(
  private ontimizeService: OntimizeService, 
  protected sanitizer: DomSanitizer,
  private translate: OTranslateService,
  ) {}

  ngOnInit() {
    // this.loadNoticeData();
  }

  // loadNoticeData(): void {
  //   this.ontimizeService.configureService('notice');
  //   this.ontimizeService.query().subscribe
  // }

  public LanguageAct(){
    this.idiomaActual = this.translate.getCurrentLang();
  }

  public getImageSrc(imgData: any): any {
    return imgData ? this.sanitizer.bypassSecurityTrustResourceUrl('data:image/*;base64,' + imgData.bytes) : './assets/images/subsify_round_logo.png"';
  }

  public getEmptyImageSrc(): any {
    return "../../../../assets/images/subsify_round_logo.png";
  }
}