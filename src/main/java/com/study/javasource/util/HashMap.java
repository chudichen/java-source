package com.study.javasource.util;

import java.io.Serializable;
import java.util.Collection;
import java.util.Set;

/**
 * @author Michael.Chu
 * @date 2019-04-15 10:46
 */
public class HashMap<K,V> implements Map<K,V>, Cloneable, Serializable {

    private static final long serialVersionUID = 8497004991625828588L;

    /**
     * 默认初始容量值 - 必须为2的指数 (默认值 16)
     */
    static final int DEFAULT_INITIAL_CAPACITY = 1 << 4;

    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean containsKey(Object key) {
        return false;
    }

    public boolean containsValue(Object value) {
        return false;
    }

    public V get(Object key) {
        return null;
    }

    public V put(K key, V value) {
        return null;
    }

    public V remove(K key) {
        return null;
    }

    public void putAll(Map<? extends K, ? extends V> m) {

    }

    public void clear() {

    }

    public Set<K> keySet() {
        return null;
    }

    public Collection<V> values() {
        return null;
    }

    public Set<Entry<K, V>> entrySet() {
        return null;
    }
}
