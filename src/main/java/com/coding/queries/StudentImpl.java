package com.coding.queries;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Naveen K Wodeyar 
 * @date 26-Jun-202411:40:41 am
 * @classDef com.coding
 */
public class StudentImpl {

	public static void main(String[] args) {

		List<Student> studentList = new ArrayList<>();
					  studentList.add(new Student("Ammie", "Science", 30));
					  studentList.add(new Student("Bella", "Social", 40));
					  studentList.add(new Student("Clara", "Maths", 50));
					  studentList.add(new Student("Diana", "English", 60));
					  studentList.add(new Student("Diana", "Science", 70));
					  studentList.add(new Student("Clara", "Social", 80));
					  studentList.add(new Student("Bella", "Maths", 90));
					  studentList.add(new Student("Ammie", "English", 100));
					  
//		studentList.stream()
//				  .collect(Collectors.groupingBy(Student::getStSubject,Collectors.maxBy(Comparator.comparing(Student::getStMarks)))).entrySet().forEach(System.out::println);
//		
		Map<String, Object> collect2 = studentList.stream().collect(Collectors.groupingBy(Student::getStSubject,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getStMarks)), s->s.get().getStName()+"-"+s.get().getStMarks())));
		System.out.println(collect2);
		
		Map<String, Student> collect3 = studentList.stream().collect(Collectors.groupingBy(Student::getStSubject,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Student::getStMarks)), s->s.get())));
		System.out.println(collect3);
		System.exit(0);
		
		
		List<Student> collect = studentList.stream()
        .collect(Collectors.groupingBy(Student::getStSubject,
                Collectors.collectingAndThen(
                        Collectors.maxBy(
                                Comparator.comparingDouble(Student::getStMarks)
                        ),
                        student -> student.orElse(null)
                )
        ))
        .values().stream()
        .filter(student -> student != null)
        .collect(Collectors.toList());
		
		System.out.println(collect);

		  
		  
	}

}
