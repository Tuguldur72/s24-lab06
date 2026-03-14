package edu.cmu.cs.cs214.rec04;

public class DelegationSortedIntList implements IntegerList {

    private SortedIntList list= new SortedIntList();
    private int totalAdded = 0;

    public int getTotalAdded() {
        return totalAdded;
    }

    @Override
    public boolean add(int num) {
        totalAdded++;
        return list.add(num);
    }

    @Override
    public boolean addAll(IntegerList other) {
        totalAdded += other.size();
        return list.addAll(other);
    }

    @Override
    public int get(int index) {
        return list.get(index);
    }

    @Override
    public boolean remove(int num) {
        return list.remove(num);
    }

    @Override
    public boolean removeAll(IntegerList other) {
        return list.removeAll(other);
    }

    @Override
    public int size() {
        return list.size();
    }
}