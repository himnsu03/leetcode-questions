class Compute {
    
    
    public long[] getTriangle(long arr[], long n)
    {ArrayList<Long> list = new ArrayList<Long>();
        for (long num : arr) {
            list.add(num);
        }
        triangle(list);

        // Convert ArrayList to array
        long[] result = new long[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    private void triangle(ArrayList<Long> list) {
          if (list.size() == 1) {
            return;
        }
        
        ArrayList<Long> new1 = new ArrayList<>();
        for (int i = 0; i < list.size() - 1; i++) {
            new1.add(list.get(i) + list.get(i + 1));
        }
        
        triangle(new1);
        
        // Clear the original list and add the elements of new1
        
         for(int  i = (int)new1.size()-1; i>=0;i--) list.add(0,new1.get(i));
    }
}
