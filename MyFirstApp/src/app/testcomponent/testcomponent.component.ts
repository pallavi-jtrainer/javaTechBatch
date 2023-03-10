import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-testcomponent',
  templateUrl: './testcomponent.component.html',
  styleUrls: ['./testcomponent.component.css']
})
export class TestcomponentComponent implements OnInit {
  showClass = true;
  employees: Array<any> = new Array<any>();

  constructor() { }

  ngOnInit(): void {
    this.employees = [
      {'id': 1001, 'name': 'frank smith', 'salary': 34567.00, 'dept': 1, 'doj': '12-03-2022'},
      {'id': 1002, 'name': 'john doe', 'salary': 34522.00, 'dept': 2},
      {'id': 1003, 'name': 'jane doe', 'salary': 37000.00, 'dept': 1},
      {'id': 1004, 'name': 'mila carrington', 'salary': 24560.00, 'dept': 1},
      {'id': 1005, 'name': 'cole jonson', 'salary': 54500.00, 'dept': 3}
    ];
  }

}
