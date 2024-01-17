import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { NoticeAdminHomeComponent } from './notice-admin-home/notice-admin-home.component';
import { NoticeAdminNewComponent } from './notice-admin-new/notice-admin-new.component';

const routes: Routes = [{
  path: '',
  component: NoticeAdminHomeComponent
},
{
  path:"new",
  component: NoticeAdminNewComponent
}
];
@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class NoticeAdminRoutingModule { }
