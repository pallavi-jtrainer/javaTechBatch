import { StudentserviceService } from './../services/studentservice.service';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Student } from '../models/Student';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  user: string = '';
  pass: string = '';
  // flag: boolean = false;
  student: Student = new Student();

  constructor(private router: Router, private studentService: StudentserviceService) { }

  ngOnInit(): void {
  }

  validate(): boolean {
    if(this.user != '' && this.pass != '') {
      return true;
    }
    return false;
  }

  gotoDash() {
    this.studentService.getStudentByEmail(this.user)
      .subscribe(data => {
        // this.flag = true;
        console.log(data);
        this.student = data;
        this.router.navigate(['/student', this.student.studentId]);
      }, error => {
        console.log(error);
      });

    // this.flag = this.validate();

    // if(this.flag) {
    //   // alert("Sign in Clicked");
    //   this.router.navigate(['/students']);
    // } else {
    //   alert("Fields cannot be empty");
    // }
  }

  goToRegister() {
    this.router.navigate(['/register']);
  }
}
