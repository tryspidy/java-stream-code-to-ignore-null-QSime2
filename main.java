List<String> result = Arrays.asList("Java", "Stream", null, "Filter", null);
result.stream().filter(str -> str != null).forEach(System.out::println)
// OR
Stream<String> result = Stream.of("java", null, "python", "devops", null);
result.filter(str -> str != null).forEach(System.out::println)