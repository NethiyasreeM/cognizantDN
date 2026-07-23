import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';

import { CourseCard } from '../../components/course-card/course-card';
import { CourseService } from '../../services/course';
import { Course } from '../../models/course.model';

@Component({
  selector: 'app-course-list',
  standalone: true,
  imports: [
    CommonModule,
    CourseCard
  ],
  templateUrl: './course-list.html',
  styleUrl: './course-list.css'
})
export class CourseList implements OnInit {

  isLoading = true;

  selectedCourseId = 0;

  courses: Course[] = [];

  constructor(private readonly courseService: CourseService) {}

  ngOnInit(): void {

  this.courses = this.courseService.getCourses();

  console.log(this.courses);

  setTimeout(() => {

    this.isLoading = false;

  }, 1500);

}

  onEnroll(courseId: number): void {

    this.selectedCourseId = courseId;

  }

  trackByCourseId(index: number, course: Course): number {

    return course.id;

  }

}