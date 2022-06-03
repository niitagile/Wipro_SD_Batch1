import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'MyfirstApp';
  products:Array<any>=[{name:"Rice", price:200},
  {name:"Sugar", price:40}];
}
