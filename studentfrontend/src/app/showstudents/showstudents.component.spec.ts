import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowstudentsComponent } from './showstudents.component';

describe('ShowstudentsComponent', () => {
  let component: ShowstudentsComponent;
  let fixture: ComponentFixture<ShowstudentsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ShowstudentsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ShowstudentsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
