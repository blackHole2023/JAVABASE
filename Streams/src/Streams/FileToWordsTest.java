package Streams;

public class FileToWordsTest {
    public static void
    main(String[] args) throws Exception {
//        System.out.println("地址："+FileToWords.class.getResource("Cheese.dat"));
        FileToWords.stream("out/production/Streams/Cheese.dat")
                .limit(7)
                .forEach(s -> System.out.format("%s ", s));
        System.out.println();
        FileToWords.stream("Streams/src/Cheese.dat")
                .skip(7)
                .limit(2)
                .forEach(s -> System.out.format("%s ", s));
    }
}