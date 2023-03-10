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
  show = false;
  pass = '';
  confirm = '';

  constructor(private router: Router, private route: ActivatedRoute,
      private studentService: StudentserviceService) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.paramMap.get('id');
    this.loadData(this.id);
  }

  loadData(id: number) {
    this.studentService.getStudentById(id)
    .subscribe(data => {
      console.log("Load Data: ", data);
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

  toggle() {
    this.show = !this.show;
  }

  cancelUpdate() {
    this.pass = '';
    this.confirm = '';
    this.show = false;
  }

  updatePassword(id: number) {
    if (this.pass == this.confirm) {
      this.student.password = this.pass;
      this.studentService.updatePassword(this.student)
      .subscribe(data => {
        console.log(data);
        if(data != null) {
          alert("Password update successful");
          window.location.reload();
        }
      })
      //alert("Update done");
      this.show = false;
    } else {
      alert("Password mismatch");
      this.pass = '';
      this.confirm = '';
    }
  }
}
