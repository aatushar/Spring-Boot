import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdatecustomarComponent } from './updatecustomar.component';

describe('UpdatecustomarComponent', () => {
  let component: UpdatecustomarComponent;
  let fixture: ComponentFixture<UpdatecustomarComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [UpdatecustomarComponent]
    });
    fixture = TestBed.createComponent(UpdatecustomarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
