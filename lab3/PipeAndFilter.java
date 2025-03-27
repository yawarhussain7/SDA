import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PipeAndFilter {
    public static void main(String[] args) {

        List<Integer> input = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Function<List<Integer>, List<Integer>>> filters = new ArrayList<>();

        filters.add(PipeAndFilter::filterEvenNumber);
        filters.add(PipeAndFilter::squareNumbers);
        filters.add(PipeAndFilter::filterNumberGreatherthenten);
        filters.add(PipeAndFilter::filterOddNumbers);

        // process the input throught the Pipeline
        List<Integer> result = processPipeLine(input, filters);

        System.out.println(result);
    }

    // process the input through the pipeline of filters
    private static List<Integer> processPipeLine(List<Integer> input,
            List<Function<List<Integer>, List<Integer>>> filters) {
        List<Integer> output = input;

        for (Function<List<Integer>, List<Integer>> filter : filters) {
            output = filter.apply(output);
        }
        return output;
    }

    // filter for even number
    private static List<Integer> filterEvenNumber(List<Integer> input) {
        return input.stream()
                .filter(n -> n % 2 == 0).collect(Collectors.toList());
    }

    // filter for square root
    private static List<Integer> squareNumbers(List<Integer> input) {
        return input.stream()
                .map(n -> n * n).collect(Collectors.toList());
    }

    // filter Greater then 10
    private static List<Integer> filterNumberGreatherthenten(List<Integer> input) {
        return input.stream()
                .filter(n -> n > 10).collect(Collectors.toList());
    }

    // filter Odd number
    private static List<Integer> filterOddNumbers(List<Integer> input) {
        return input.stream()
                .filter(n -> (n % 2) != 0).collect(Collectors.toList());
    }

}