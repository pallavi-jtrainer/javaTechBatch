import { Student } from './../models/Student';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

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
}
