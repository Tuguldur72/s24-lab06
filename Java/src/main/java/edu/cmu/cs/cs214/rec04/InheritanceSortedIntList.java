package edu.cmu.cs.cs214.rec04;

public class InheritanceSortedIntList extends SortedIntList {

    private int totalAdded = 0;

    public int getTotalAdded() {
        return totalAdded;
    }

    @Override
    public boolean add(int num) {
        totalAdded++;
        return super.add(num);
    }

    @Override
    public boolean addAll(IntegerList list) {
        totalAdded += list.size();
        return super.addAll(list);
    }
}