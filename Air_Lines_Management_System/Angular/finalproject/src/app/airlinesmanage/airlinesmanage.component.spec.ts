import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AirlinesmanageComponent } from './airlinesmanage.component';

describe('AirlinesmanageComponent', () => {
  let component: AirlinesmanageComponent;
  let fixture: ComponentFixture<AirlinesmanageComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AirlinesmanageComponent]
    });
    fixture = TestBed.createComponent(AirlinesmanageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
