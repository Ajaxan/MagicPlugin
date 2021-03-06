package com.elmakers.mine.bukkit.block;

import java.util.HashSet;

public class NegatedHashSet<T> extends HashSet<T> {
    private static final long serialVersionUID = 1L;

    @Override
    public boolean contains(Object o) {
        return !super.contains(o);
    }
}
