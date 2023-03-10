import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-componenttwo',
  templateUrl: './componenttwo.component.html',
  styleUrls: ['./componenttwo.component.css']
})
export class ComponenttwoComponent implements OnInit {

  fname: string = '';
  lname: string = '';
  email: string = '';
  phone: string = '';

  constructor() { }

  ngOnInit(): void {
  }

}
