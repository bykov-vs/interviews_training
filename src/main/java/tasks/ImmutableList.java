package tasks;

import java.util.Arrays;

public final class ImmutableList<T> {
    private final T[] list;

    public ImmutableList(T[] list) {
        this.list = Arrays.copyOf(list, list.length);
    }

    public T[] getList() {
        return Arrays.copyOf(list, list.length);
    }

    public T get(int index) {
        return Arrays.copyOf(list, list.length)[index];
    }
}
