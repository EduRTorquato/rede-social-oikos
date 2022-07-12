import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {ButtonModule} from 'primeng/button';
import {InputTextModule} from 'primeng/inputtext';
import {CalendarModule} from 'primeng/calendar';
import {PasswordModule} from 'primeng/password';


@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    ButtonModule,
    InputTextModule,
    CalendarModule,
    PasswordModule
  ],
  exports:[
    ButtonModule,
    InputTextModule,
    CalendarModule,
    PasswordModule
  ]
})
export class PrimeModule { }
