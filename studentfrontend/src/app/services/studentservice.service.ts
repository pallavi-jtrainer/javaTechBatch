import { Student } from './../models/Student';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map, Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class StudentserviceService {

  private baseUrl = 'http://localhost:8280/api/students';

  constructor(private http: HttpClient) { }

  listAllStudents(): Observable<Student[]> {
    return this.http.get<Student[]>(`${this.baseUrl}`);
  }

  getStudentById(id: number): Observable<Student> {
    return this.http.get<Student>(`${this.baseUrl}/${id}`);
  }

  getStudentByEmail(email: string): Observable<Student> {
    return this.http.get<Student>(`${this.baseUrl}/email/${email}`);
  }

  getStudentByContact(ph: string): Observable<Student> {
    return this.http.get<Student>(`${this.baseUrl}/contact/${ph}`);
  }

  // /**
  //  * to upload student details into the persistence layer
  //  * @param student object of Student class
  //  * @returns any
  //  */
  // createStudent(student: Student): Observable<any> {
  //   let body = JSON.stringify(student);
  //   return this.http.post(`${this.baseUrl}`, body,
  //   {headers: {'content-type': 'application/json'}});
  // }

  createStudent(student:Student): Observable<Student> {
    return this.http.post<Student>(`${this.baseUrl}`, student);
  }

  // updatePassword(student: Student): Observable<any> {
  //   return this.http.put(
  //     `${this.baseUrl}/pass/${student.studentId}/${student.password}`,
  //      student,
  //   {headers: {'content-type': 'application/json'},
  //   observe: 'response',
  //     'responseType': 'text'})
  //     .pipe(map(data => {
  //       return data.body;
  //     }));
  // }

  updatePassword(student: Student): Observable<Student> {
    return this.http.put<Student>(
      `${this.baseUrl}/pass/${student.studentId}/${student.password}`,
       student);
  }
}
