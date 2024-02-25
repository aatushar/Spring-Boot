import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CustomarmanageComponent } from './customarmanage.component';

describe('CustomarmanageComponent', () => {
  let component: CustomarmanageComponent;
  let fixture: ComponentFixture<CustomarmanageComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CustomarmanageComponent]
    });
    fixture = TestBed.createComponent(CustomarmanageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
