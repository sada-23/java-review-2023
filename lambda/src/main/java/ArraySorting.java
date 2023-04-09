public class ArraySorting {

    public static void main(String[] args) {

        ArraySorting as = new ArraySorting();
//        as.sort();

        QuickSort qs = new QuickSort();
        BubleSort bs = new BubleSort();
        as.sort(qs);
        as.sort(bs);

       Sorting quickSort = () -> System.out.println("Quick sortingggg");
       as.sort(quickSort);

       Sorting bubbleSort = () -> System.out.println("Bubble sortingggg");
       as.sort(bubbleSort);

       as.sort(() -> System.out.println("Bubble sorting"));


    }

    private void sort(Sorting sorting) {
        sorting.sort();
    }
}


