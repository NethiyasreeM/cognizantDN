import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';


import {
  ReactiveFormsModule,
  FormBuilder,
  FormGroup,
  Validators,
  AbstractControl,
  ValidationErrors,
  FormArray,
  FormControl
} from '@angular/forms';

@Component({
  selector: 'app-reactive-enrollment-form',
  standalone: true,
  imports: [
    CommonModule,
    ReactiveFormsModule
  ],
  templateUrl: './reactive-enrollment-form.html',
  styleUrl: './reactive-enrollment-form.css'
})
export class ReactiveEnrollmentForm {

  enrollForm: FormGroup;

  constructor(private readonly fb: FormBuilder) {

    this.enrollForm = this.fb.group({

      studentName: [
        '',
        [
          Validators.required,
          Validators.minLength(3)
        ]
      ],

      studentEmail: this.fb.control(
        '',
        [
          Validators.required,
          Validators.email
        ],
        [
          this.simulateEmailCheck
        ]
      ),

      courseId: [
        '',
        [
          Validators.required,
          this.noCourseCode
        ]
      ],

      preferredSemester: [
        'Odd',
        Validators.required
      ],

      agreeToTerms: [
        false,
        Validators.requiredTrue
      ],

      additionalCourses: this.fb.array([])

    });

  }

  // Custom Validator
  noCourseCode(control: AbstractControl): ValidationErrors | null {

  if (control.value?.startsWith('XX')) {

    return { noCourseCode: true };

  }

  return null;

}

  // Async Validator
  simulateEmailCheck(control: AbstractControl): Promise<ValidationErrors | null> {

    return new Promise(resolve => {

      setTimeout(() => {

        if (control.value?.includes('test@')) {

  resolve({ emailTaken: true });

} else {

  resolve(null);

}

      }, 800);

    });

  }

  // Getter for FormArray
  get additionalCourses(): FormArray<FormControl> {

  return this.enrollForm.get('additionalCourses') as FormArray<FormControl>;

}

  // Add Course
  addCourse(): void {

  this.additionalCourses.push(

    new FormControl('', Validators.required)

  );

}

  // Remove Course
  removeCourse(index: number) {

    this.additionalCourses.removeAt(index);

  }

  onSubmit() {

    console.log(this.enrollForm.value);

    console.log(this.enrollForm.getRawValue());

  }

}