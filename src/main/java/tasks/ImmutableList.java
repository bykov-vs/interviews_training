package tasks;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableList {
    private final List<?> list;

    public ImmutableList(List<?> list) {
        this.list = new ArrayList<>(list);
    }

    public List<?> getList() {
        return new ArrayList<>(list);
    }
}
