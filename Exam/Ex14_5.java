package Exam;
import java.util.*;
import java.util.stream.*;

class Ex14_5 {
	public static void main(String[] args) {
		Stream<Student> studentStream = Stream.of(
						new Student("a", 3, 301),
						new Student("b", 1, 201),
						new Student("c", 2, 115),
						new Student("d", 2, 182),
						new Student("e", 1, 236),
						new Student("f", 3, 334),
						new Student("g", 3, 207),
						new Student("h", 3, 293),
						new Student("i", 1, 181),
						new Student("j", 2, 145),
						new Student("k", 2, 116),
						new Student("l", 1, 183),
						new Student("m", 3, 280),
						new Student("n", 3, 184)
						);

//		studentStream.sorted(Comparator.comparing(Student::getBan) // 반별 정렬
//		 	.thenComparing(Comparator.naturalOrder()))     	// 기본 정렬
//			.forEach(System.out::println);
		System.out.println("++++++++++++++++++++++++++");
		studentStream.sorted(Comparator.comparing(Student::getBan).thenComparing(Student::getTotalScore)).forEach(System.out::println);

		String str = "there are four seasons in a year";
		String reGex = "\\s\\w";
		String[] str_lst = str.split(reGex);
		System.out.println(Arrays.toString(str_lst));

		String stri = "There is not a good reason for a swimming in the pool";
		Stream<String> striStream = Stream.of(stri);
		striStream.flatMap(line -> Stream.of(line.split(" +")))
				.map(String::toUpperCase)
                .distinct()
				.sorted()
				.forEach(s -> System.out.println(s));




	}
}

class Student implements Comparable<Student> {
	String name;
	int ban;
	int totalScore;
	Student(String name, int ban, int totalScore) { 
		this.name =name;
		this.ban =ban;
		this.totalScore =totalScore;
	}

	public String toString() { 
	   return String.format("[%s, %d, %d]", name, ban, totalScore); 
	}

	String getName()     { return name;}
	int getBan()         { return ban;}
	int getTotalScore()  { return totalScore;}

   // 총점 내림차순을 기본 정렬로 한다.
	public int compareTo(Student s) { 
		return s.totalScore - this.totalScore;
	}
}