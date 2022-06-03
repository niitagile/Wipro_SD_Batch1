/*
  View Encapsulation- hides style of a component from other part.
  3 strategies:
ViewEncapsulation.None
ViewEncapsulation.Emulated-- default
ViewEncapsulation.ShadowDOM

*/




import { Component, OnInit,Input, ViewEncapsulation } from '@angular/core';

@Component({
  selector: 'app-greet',
  templateUrl: './greet.component.html',
 
  styleUrls: ['./greet.component.css']
 /* template: `
  <h2>None</h2>
  <div>No encapsulation</div>
`,
styles: ['h1 { color: red; }'],
encapsulation: ViewEncapsulation.None,*/
})
export class GreetComponent implements OnInit {
  @Input()  productList: Array<any>=[];
  constructor() { }

  ngOnInit(): void {
    console.log("init method");
  }
  ngOnDestroy():void{
    console.log("destroy method");
  }
}
