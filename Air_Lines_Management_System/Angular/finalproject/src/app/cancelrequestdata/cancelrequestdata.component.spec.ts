import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CancelrequestdataComponent } from './cancelrequestdata.component';

describe('CancelrequestdataComponent', () => {
  let component: CancelrequestdataComponent;
  let fixture: ComponentFixture<CancelrequestdataComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CancelrequestdataComponent]
    });
    fixture = TestBed.createComponent(CancelrequestdataComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
