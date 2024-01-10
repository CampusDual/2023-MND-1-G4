import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { NoticeHomeComponent } from './notice-home/notice-home.component';


const routes: Routes = [{
  path: '',
  component: NoticeHomeComponent

}];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class NoticeRoutingModule { }
