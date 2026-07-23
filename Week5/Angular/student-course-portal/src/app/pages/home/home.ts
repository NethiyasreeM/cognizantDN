import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { CourseService } from '../../services/course';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [
    CommonModule,
    FormsModule
  ],
  templateUrl: './home.html',
  styleUrl: './home.css'
})
export class Home implements OnInit {

  portalName = 'Student Course Portal';

  courseCount = 0;

  isPortalActive = true;

  message = '';

  searchTerm = '';

  constructor(private readonly courseService: CourseService) {}

  ngOnInit(): void {

    this.courseCount = this.courseService.getCourses().length;

  }

  onEnrollClick(): void {

    this.message = 'Enrollment button clicked!';

  }

}