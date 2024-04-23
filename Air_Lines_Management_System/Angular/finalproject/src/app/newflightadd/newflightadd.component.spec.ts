import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NewflightaddComponent } from './newflightadd.component';

describe('NewflightaddComponent', () => {
  let component: NewflightaddComponent;
  let fixture: ComponentFixture<NewflightaddComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [NewflightaddComponent]
    });
    fixture = TestBed.createComponent(NewflightaddComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
