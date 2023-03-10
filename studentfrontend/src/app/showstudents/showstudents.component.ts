import { Student } from './../models/Student';
import { StudentserviceService } from './../services/studentservice.service';
import { Router, ActivatedRoute } from '@angular/router';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-showstudents',
  templateUrl: './showstudents.component.html',
  styleUrls: ['./showstudents.component.css']
})
export class ShowstudentsComponent implements OnInit {

  students: Student[] = [];
  id: any;

  constructor(private router:Router, private route: ActivatedRoute,
    private studentService: StudentserviceService) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.paramMap.get('id');
    this.loadData();
  }

  loadData() {
    this.studentService.listAllStudents()
      .subscribe(data => {
        console.log(data);
        this.students = data;
      });
  }

  logout() {
    this.router.navigate(['/login']);
  }

  showProfile() {
    this.router.navigate(['/student', this.id]);
  }

  showStudentDetails(id: number) {
    this.router.navigate(['/student', id]);
  }
}
