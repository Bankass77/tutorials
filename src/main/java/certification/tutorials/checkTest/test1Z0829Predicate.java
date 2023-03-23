
/*
 *
 * 
 * import java.util.Map.Entry; import java.util.function.Predicate; import
 * java.util.stream.Collectors; import java.util.stream.Stream;
 * 
 * public class test1Z0829Predicate {
 * 
 * public static void main(String[] args) {
 * 
 * Predicate<String> enmpty = String::isEmpty;
 * 
 * Predicate<String> notEmpty = enmpty.negate();
 * 
 * var result = Stream.generate(() ->
 * "").filter(notEmpty).collect(Collectors.groupingBy(k -> k)).entrySet()
 * .stream().map(Entry::getValue).flatMap(Collection::stream).colect(Collectors.
 * partitioningBy(notEmpty)); System.out.println(result); }
 * 
 * }
 */