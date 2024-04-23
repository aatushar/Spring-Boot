import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CompanymanageComponent } from './companymanage.component';

describe('CompanymanageComponent', () => {
  let component: CompanymanageComponent;
  let fixture: ComponentFixture<CompanymanageComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CompanymanageComponent]
    });
    fixture = TestBed.createComponent(CompanymanageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
