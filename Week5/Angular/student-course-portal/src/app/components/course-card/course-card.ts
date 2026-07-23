import { Component, EventEmitter, Input, Output } from '@angular/core';
import { CommonModule } from '@angular/common';

import { Highlight } from '../../directives/highlight';
import { CreditLabelPipe } from '../../pipes/credit-label-pipe';

@Component({
  selector: 'app-course-card',
  standalone: true,
  imports: [
    CommonModule,
    Highlight,
    CreditLabelPipe
  ],
  templateUrl: './course-card.html',
  styleUrl: './course-card.css'
})
export class CourseCard {

  @Input()
  course!: {
    id: number;
    name: string;
    code: string;
    credits: number;
    gradeStatus: string;
  };

  @Output()
  enrollRequested = new EventEmitter<number>();

  isExpanded = false;

  isEnrolled = false;

  enroll() {

    this.isEnrolled = true;

    this.enrollRequested.emit(this.course.id);

  }

  toggleDetails() {

    this.isExpanded = !this.isExpanded;

  }

  get cardClasses() {

    return {

      'card--enrolled': this.isEnrolled,

      'card--full': this.course.credits >= 4,

      'expanded': this.isExpanded

    };

  }

  getBorderColor() {

    if (this.course.gradeStatus === 'passed') {

      return 'green';

    }

    if (this.course.gradeStatus === 'failed') {

      return 'red';

    }

    return 'gray';

  }

}