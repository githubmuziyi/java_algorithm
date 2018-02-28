package java_stream;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

/**
 * java8 流式操作
 * @author muzi
 */
public class Steam {

    public static void main(String[] args) {

        List<Integer> nums = Lists.newArrayList(1, null, 2, 3, null, 4);
        Long count = nums.stream().filter(Objects::nonNull).count();
        System.out.println(count);
        Stream.iterate(1, item -> item + 1).limit(10).forEach(System.out::println);
    }
}
