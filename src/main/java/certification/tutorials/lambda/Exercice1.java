package certification.tutorials.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Exercice1 {

	public static void main(String[] args) {

		// create Stream from a List
		List<String> objectStream = List.of("string1", "string2", "string3");

		System.out.println(objectStream);
		// create Stream from a Object
		Stream<Object> object = Stream.of(new Object());

		System.out.println();
		// Stream<Object> objectStream= Stream.of(new Object(), new Object(), new
		// Object());

		String[] stringArray = new String[] { "string1", "string2", "string3" };
		// create Stream from a array
		Stream<String> stream = Arrays.stream(stringArray);
		System.out.println(stream);

		// create Stream from a List
		Stream<Object> nullableStream = Stream.ofNullable(new Object());

		System.out.println(nullableStream);
		// create iterate on Stream
		Stream<Integer> stream2 = Stream.iterate(0, (i) -> {

			return i + 1;

		}).limit(5);

		// create the stream using a class Builder with accept() method
		Stream.Builder<String> streBuilder = Stream.builder();

		for (int j = 0; j < 10; j++) {

			streBuilder.accept("string" + j);
		}

		Stream.Builder<String> streamBuilder = Stream.builder();
		streamBuilder.add("strin1").add("string2").add("string3");

		streamBuilder.build();

		// Parellel Stream

		List.of("string", "string2", "string3").parallelStream();

		List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0).stream().parallel();

		Stream.of(1, 2, 3).onClose(() -> {
			System.out.println("Closed");
		}).onClose(() -> {

			System.out.println("Close handler 2");
		}).onClose(() -> {
			System.out.println("Close Handler 3");
		}).close();

		// AutoClosable
		try (Stream<Integer> stream3 = Stream.of(6, 3, 8, 12, 3, 9)) {
			boolean matched = stream3.onClose(() -> {

			}).anyMatch((e) -> {
				return e > 10;
			});
			System.out.println(matched);
		}

		// Terminal Operation with :

		// ForEachOrdered and parallel
		Stream.of(1, 3, 8, 6).parallel().forEachOrdered((n) -> {
			System.out.println(n);
		});

		// toArray
		Object[] array = Stream.of(1, 5, 9, 60).toArray();

		Integer[] arrInteger1 = Stream.of(2, 8, 45, 21).toArray(Integer[]::new);

		Integer[] arrayInteger2 = Stream.of(1, 7, 9, 4).toArray(element -> new Integer[element]);

		System.out.println("-----Reduce-----------------------");
		// reduce

		int num = Stream.of(1, 5, 9, 65).reduce(0, (a, b) -> a + b);

		System.out.println(num);
		int num2 = Stream.of(1, 5, 9, 65).reduce(0, (total, i) -> total + i, (a, b) -> a + b);

		System.out.println("-------------End reduce method------------------");
		System.out.println(num2);

		// Stream Parallel creation

		List.of("String", "string1").parallelStream();

		// or

		List.of("string", "string2").stream().parallel();

		List.of(1, 5).stream().parallel().parallel().parallel();

		List.of("string", "string3").parallelStream().sequential();

		// Close method
		Stream.of(1, 2, 3, 4).onClose(() -> {

			System.out.println("Close Handler");
		}).onClose(() -> {

			System.out.println(" Close handler 1");
		}).onClose(() -> {

			System.out.println("Close Handler 2");
		}).close();

		try (Stream<Integer> stream1 = Stream.of(2, 8, 9, 34, 25)) {

			boolean matched = stream1.onClose(() -> {

				System.out.print("Close in try-with-resources block");

			}).anyMatch((e) -> {

				return e > 10;
			});
			System.out.println(matched);
		}

		System.out.println();
		// ForEach
		System.out.println("-------------ForEach block--------------------");
		Stream.of(1, 4, 6, 9, 43).forEach((n) -> {
			System.out.println(n);
		});

		System.out.println("-------------ForEach block  with stream parallel--------------------");
		Stream.of(3, 7, 9, 0, 10).parallel().forEach((n) -> {
			System.out.println(n);
		});

		System.out.println();
		System.out.println("-------------ToArray block  with stream --------------------");

		Object[] arrays2 = Stream.of(6, 8, 90).toArray();

		Integer[] integerArray = Stream.of(5, 9, 0, 45).toArray(elements -> new Integer[elements]);

		System.out.println();
		System.out.println("-------------Reduce block  with stream --------------------");

		int sum = Stream.of(3, 8, 4, 7).reduce(0, (a, b) -> a + b);
		System.out.println(sum);

		int sum2 = Stream.of(4, 8, 32, 67).reduce(0, (total, i) -> total + i, (a, b) -> a + b);

		System.out.println(sum2);

		Optional<Integer> sum3 = Stream.of(3, 5).reduce((a, b) -> a + b);
		System.out.println(sum3.get());

		System.out.println();
		System.out.println("-------------sum block  with stream --------------------");

		int intSum = IntStream.of(5, 8, 9).sum();
		System.out.println(intSum);
		long longSum = LongStream.of(7L, 9L, 13L).sum();

		System.out.println(longSum);
		double doubleSum = DoubleStream.of(4.0, 6.0).sum();

		System.out.println(doubleSum);

		System.out.println();
		System.out.println("-------------Collect block  with stream --------------------");

		List<Integer> items = Stream.of(6, 5, 9, 4).collect(Collectors.toList());
		System.out.println(items);

		List<Integer> itIntegers = Stream.of(6, 9, 5).collect(() -> {
			return new ArrayList<>();
		}, (list, i) -> {
			list.add(i);
		}, (list, elements) -> {
			list.addAll(elements);
		});

		System.out.println(itIntegers);

		// ceci peut simplify à

		List<Integer> items5 = Stream.of(5, 9, 56, 12).collect(

				ArrayList::new, List::add, List::addAll

		);
		System.out.println(items5);

		System.out.println();
		System.out.println("-------------Min block  with stream --------------------");

		Optional min = Stream.of(5, 9, 8, 6, 12, 3).min(

				(a, b) -> {
					return a - b;
				});
		System.out.println(min.get());

		System.out.println();
		System.out.println("-------------Max block  with stream --------------------");

		Optional max = Stream.of(6, 98, 45, 23).max((a, b) -> {

			return a - b;
		});

		System.out.println(max.get());

		System.out.println();
		System.out.println("-------------Average block  with stream --------------------");

		OptionalDouble avg = IntStream.of(6, 9, 5, 3, 90).average();
		System.out.println(avg.getAsDouble());

		OptionalDouble avg2 = LongStream.of(7L, 9L, 13L).average();

		System.out.println(avg2.getAsDouble());
		OptionalDouble avg3 = DoubleStream.of(6, 9, 34).average();

		System.out.println(avg3.getAsDouble());

		System.out.println();
		System.out.println("-------------Count block  with stream --------------------");

		int count = (int) Stream.of(6, 9, 4, 1).count();
		System.out.println(count);

		System.out.println();
		System.out.println("-------------allMatch block  with stream --------------------");

		boolean anyMatch = Stream.of(6, 4, 8, 12, 3, 9).allMatch((e) -> {

			return e > 10;
		});
		System.out.println(anyMatch);

		System.out.println();
		System.out.println("-------------AnyMatch block  with stream --------------------");
		boolean anyMatched = Stream.of(67, 9, 43, 6).anyMatch((e) -> {

			return e > 30;
		});
		System.out.println(anyMatched);

		System.out.println();
		System.out.println("-------------noneMatch block  with stream --------------------");

		boolean noneMatched = Stream.of(7, 9, 45).noneMatch((e) -> {
			return e > 10;
		});

		System.out.println(noneMatched);

		System.out.println();
		System.out.println("-------------findFirst block  with stream --------------------");

		Optional findFirstElement = Stream.of(5, 8, 90).findFirst();
		System.out.println(findFirstElement);

		System.out.println();
		System.out.println("-------------findAny block  with stream --------------------");

		Optional findAnyElement = Stream.of(6, 9, 4).findAny();

		System.out.println(findAnyElement);

		System.out.println();
		System.out.println("-------------Iterator block  with stream --------------------");

		Iterator<Integer> iterator = Stream.of(7, 9, 32, 67).iterator();

		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();

			System.out.println(integer);

		}

		System.out.println();
		System.out.println("-------------SymmariStatistics block  with stream --------------------");

		IntSummaryStatistics intStatistics = IntStream.of(7, 9, 12).summaryStatistics();
		System.out.println(intStatistics);

		LongSummaryStatistics longStatistics = LongStream.of(7L, 9L, 45L).summaryStatistics();
		System.out.println(longStatistics);

		DoubleSummaryStatistics doubleSummaryStatistics = DoubleStream.of(5, 9, 6, 8).summaryStatistics();
		System.out.println(doubleSummaryStatistics);

		// Intermediates operation

		System.out.println();
		System.out.println("-------------filter operation--------------------");

		Stream.of(1, 2, 3, 4, 5, 6).filter((n) -> {

			return n > 3;
		}).forEach(System.out::println);

		System.out.println();
		System.out.println("-------------Map Operation --------------------");

		Stream.of("5", "3", "8", "2").map((n) -> {
			return Integer.parseInt(n);
		}).forEach((i) -> {
			System.out.println(i > 3);
		});

		System.out.println();
		System.out.println("-------------MapToInt Operation --------------------");

		Stream.of("5", "3", "8", "2").mapToInt((i) -> {
			return Integer.parseInt(i);
		}).forEach((n) -> {
			System.out.println(n > 3);
		});

		System.out.println();
		System.out.println("-------------flatMap Operation --------------------");

		Stream.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9)).flatMap((l) -> {
			return l.stream();
		}).forEach((i) -> {
			System.out.println(i);
		});

		System.out.println();
		System.out.println("-------------Distinct Operation --------------------");

		Stream.of(1, 2, 2, 2, 2, 3).distinct().forEach(System.out::println);

		System.out.println();
		System.out.println("-------------Sorted without argument  Operation --------------------");

		Stream.of(1, 3, 6, 4, 5, 2).sorted().forEach(System.out::println);

		System.out.println();
		System.out.println("-------------Sorted with argument  Operation --------------------");

		Stream.of(1, 3, 6, 4, 5, 2).sorted((a, b) -> a - b).forEach(System.out::println);

		System.out.println();
		System.out.println("-------------UnOrdered   Operation --------------------");

		Stream.of(1, 3, 6, 4, 5, 2).unordered().forEach(System.out::println);

		System.out.println();

		Stream.of(1, 3, 6, 4, 5, 2).parallel().unordered().forEach(System.out::println);

		System.out.println();
		System.out.println("-------------Limit   Operation --------------------");

		Stream.of(1, 3, 6, 4, 5, 2).limit(3).forEach(System.out::println);

		System.out.println();
		System.out.println("-------------Skip   Operation --------------------");

		Stream.of(1, 3, 6, 4, 5, 2).skip(3).forEach(System.out::println);

		System.out.println();
		System.out.println("-------------Boxed   Operation --------------------");

		IntStream.of(1, 2).boxed().forEach(System.out::println);

		System.out.println();

		IntStream.of(1, 2).boxed().forEach((i) -> {
			System.out.println(i.getClass().getSimpleName());
		});

		System.out.println();
		LongStream.of(3, 3).boxed().forEach((j) -> {
			System.out.println(j.getClass().getSimpleName());
		});

		System.out.println();

		DoubleStream.of(5, 6).boxed().forEach((m) -> {
			System.out.println(m.getClass().getSimpleName());
		});

		System.out.println();
		System.out.println("-------------takeWhile with stream ordered  Operation --------------------");

		Stream.of(2, 2, 2, 3, 1, 2, 5).takeWhile((i) -> {

			return i == 2;
		}).forEach((i) -> {
			System.out.println(i);
		});

		System.out.println();
		System.out.println("-------------takeWhile with stream unordered  Operation --------------------");

		Stream.of(1, 2, 2, 3, 1, 2, 5).takeWhile((i) -> {

			return i == 2;
		}).forEach((i) -> {
			System.out.println(i);
		});

		System.out.println();
		System.out.println("-------------Drop with stream ordered  Operation --------------------");

		Stream.of(2, 2, 2, 3, 1, 2, 5).dropWhile((i) -> {

			return i == 2;
		}).forEach((i) -> {
			System.out.println(i);
		});

		System.out.println();
		System.out.println("-------------Peek Operation --------------------");

		long countPeek = Stream.of(6, 5, 3, 8, 1, 9, 2, 4, 7, 0).peek((i) -> {
			System.out.println(i);
		}).filter((i) -> {
			return i < 5;
		}).peek((i) -> {
			System.out.println(i);
		}).map((i) -> {
			return String.valueOf(i);
		}).peek((p) -> {
			System.out.println(p);
		}).count();
		System.out.println(countPeek);

		/*
		 * long sumPeek= Stream.of(new Integer.(1), new MyItem(2), new
		 * MyItem(3)).peek((item)->{ item.value=0; }).mapToInt((item)->{ return
		 * item.value; }).sum(); System.out.println(sumPeek);
		 */

	}
}
