import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MyTeamManagementComponent } from '../myteam-management/myteam-management.component';

describe('MyTeamManagementComponent', () => {
  let component: MyTeamManagementComponent;
  let fixture: ComponentFixture<MyTeamManagementComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MyTeamManagementComponent ]
   })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MyTeamManagementComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});