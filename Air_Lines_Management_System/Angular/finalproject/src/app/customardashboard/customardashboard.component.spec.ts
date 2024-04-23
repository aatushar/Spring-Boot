import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CustomardashboardComponent } from './customardashboard.component';

describe('CustomardashboardComponent', () => {
  let component: CustomardashboardComponent;
  let fixture: ComponentFixture<CustomardashboardComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CustomardashboardComponent]
    });
    fixture = TestBed.createComponent(CustomardashboardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
