import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CitymanageComponent } from './citymanage.component';

describe('CitymanageComponent', () => {
  let component: CitymanageComponent;
  let fixture: ComponentFixture<CitymanageComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CitymanageComponent]
    });
    fixture = TestBed.createComponent(CitymanageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
