package collections;

import reflection.pets.*;

import java.util.Iterator;

class PetSequence {
    protected Pet[] pets = new PetCreator().array(8);
}

public class NonCollectionSequence extends PetSequence {
    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {//匿名内部类。创建了个迭代器类。前面的Iterator<Pet>是向上转型的接口，标签。
            private int index = 0;
            @Override public boolean hasNext() {
                return index < pets.length;
            }
            @Override
            public Pet next() { return pets[index++]; }
            @Override
            public void remove() { // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }
    public static void main(String[] args) {
        NonCollectionSequence nc =
                new NonCollectionSequence();
        InterfaceVsIterator.display(nc.iterator());
    }
}
/* Output:
0:Rat 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug
7:Manx
*/
