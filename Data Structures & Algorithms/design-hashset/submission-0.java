class MyHashSet {
    private final int maxValue=1000000;
    private final int arr_size= 100;
    List<List<Integer>> parentlist;

    public MyHashSet() {
        parentlist=new ArrayList<>(arr_size);
        for(int i=0;i<arr_size;i++){
            parentlist.add(null);
        }
    }
    
    public void add(int key) {
        int index=key % arr_size;
        List<Integer> childlist=parentlist.get(index);

        if(childlist==null){
            List<Integer> list=new ArrayList<>();
            list.add(key);
            parentlist.set(index,list);
        }
        else{
            if(!childlist.contains(key)){
                childlist.add(key);
            }
        }

    }
    
    public void remove(int key) {
        int index= key % arr_size;
        List<Integer> childlist=parentlist.get(index);

        if(childlist!=null){
            childlist.remove(Integer.valueOf(key));
        }
    }
    
    public boolean contains(int key) {
        int index= key % arr_size;
        List<Integer> childlist= parentlist.get(index);

        return childlist != null && childlist.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */