package tasks;

import java.util.List;

public final class ImmutableList<T> {
    private final List<T> list;

    public ImmutableList(List<T> list) {
        this.list = List.copyOf(list);
    }

    public List<T> getList() {
        return List.copyOf(list);
    }

    public T get(int index) {
        return List.copyOf(list).get(index);
    }
}
