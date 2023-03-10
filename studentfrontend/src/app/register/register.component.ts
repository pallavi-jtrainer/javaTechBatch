import { StudentserviceService } from './../services/studentservice.service';
import { Student } from './../models/Student';
import { Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  name = '';
  email = '';
  ph = '';
  pass ='';
  confirm = '';
  student: Student = new Student();

  constructor(private router: Router, private studentService: StudentserviceService) { }

  ngOnInit(): void {
  }

  submit() {
    if(this.pass == this.confirm) {
      this.student.studentId = 0;
      this.student.studentName = this.name;
      this.student.email = this.email;
      this.student.contact = this.ph;
      this.student.password = this.pass;
      console.log(this.student);

      this.studentService.createStudent(this.student)
      .subscribe(data => {
        console.log("Data: " + data);
        if (data != null) {
          alert("Student Details inserted successfully");
          this.router.navigate(['/login']);
        }
      }, error => {console.log(error)})
      //this.router.navigate(['/login']);
    } else {
      alert("Re-enter the details");
      window.location.reload();
    }
  }
}
