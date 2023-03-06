import { StudentserviceService } from './../services/studentservice.service';
import { Student } from './../models/Student';
import { ActivatedRoute, Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-studentdetails',
  templateUrl: './studentdetails.component.html',
  styleUrls: ['./studentdetails.component.css']
})
export class StudentdetailsComponent implements OnInit {
  id: any;
  student: Student = new Student();

  constructor(private router: Router, private route: ActivatedRoute,
      private studentService: StudentserviceService) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.paramMap.get('id');
    this.loadData(this.id);
  }

  loadData(id: number) {
    this.studentService.getStudentById(id)
    .subscribe(data => {
      console.log(data);
      this.student = data;
    }, error => {
      console.log(error);
    });
  }

  logout() {
    this.router.navigate(['/login']);
  }

  goToAllStudents() {
    this.router.navigate(['/students', this.id]);
  }
}
