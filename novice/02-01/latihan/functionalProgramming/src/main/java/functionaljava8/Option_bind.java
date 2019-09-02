package functionaljava8;

public final class Option_bind {
    public static void main(final String[] args) {
        final Option<Integer> o1 = some(7);
        final Option<Integer> o2 = some(8);
        final Option<Integer> o3 = none();

        F<Integer, Option<Integer>> f = i -> i % 2 == 0 ? some(i * 3) : none();
        final Option<Integer> o4 = o1.bind(f);
        final Option<Integer> o5 = o2.bind(f);
        final Option<Integer> o6 = o3.bind(f);

        optionShow(intShow).println(o4); // None
        optionShow(intShow).println(o5); // Some(24)
        optionShow(intShow).println(o6); // None
    }
}