import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { NoticeHomeComponent } from './notice-home/notice-home.component';
import { NoticeNewComponent } from './notice-new/notice-new.component';


const routes: Routes = [{
  path: '',
  component: NoticeHomeComponent
},
{
  path:"new",
  component: NoticeNewComponent
}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class NoticeRoutingModule { }
